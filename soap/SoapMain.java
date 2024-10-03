
import javax.xml.soap.*;

public class SoapMain {

    public static SOAPMessage createSOAPRequest() throws Exception{
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        soapEnvelope.addNamespaceDeclaration("soap", "http://schemas.xmlsoap.org/soap/envelope/");
        soapEnvelope.addNamespaceDeclaration("ns", "http://www.oorsprong.org/websamples.countryinfo");
        SOAPBody soapBody = soapEnvelope.getBody();
        SOAPElement capitalCityElement = soapBody.addChildElement("CapitalCity", "ns");
        SOAPElement countryCode = capitalCityElement.addChildElement("sCountryISOCode");
        countryCode.addTextNode("US");
        soapMessage.saveChanges();
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", "http://www.oorsprong.org/websamples.countryinfo#CapitalCity");
        headers.addHeader("Content-Type", "text/xml;charset=UTF-8");
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();
        return soapMessage;
    }

    public static void main(String[] args) {
        try{
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            String url = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";

            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

            System.out.println("Response from SOAP Request:");
            soapResponse.writeTo(System.out);
            soapConnection.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
