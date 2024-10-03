# Simple Object Access Protocol

### What is Soap?
SOAP is a secure way to build APIs, and it works by encoding data in XML format. 

### Comparison with REST?
REST (Representational State Transfer) is more flexible and concise in comaprison. It supports multiple formats - JSON, XML, plain text etc.

### Merits and Demerits?
1. Language, transport and platform independent.
2. Built-in error handling.
3. Does not support caching API calls.
4. Complicated and Verbose then REST.
5. Slower than REST.

### createSOAPMessage():
This method creates and constructs the message.
1. MessageFactory is used to create SOAPMessages object.
2. createMessage() methods create a blank SOAP Message.
3. SOAP message consists of envelope, header and body. They reside in the soapPart.
4. We added the namespace declarations to the envelope next. Expanding:
 - soap: The standard namespace 
 - ns: The API specific namespace.
5. Next we get the body. Adds child elements and place the namespaces.
6. We add the text to the element using addTextNode().
7. Then we saved the changes to the soap message.
8. getMimeHeaders() gets all the headers of the soap message.
9. addHeader() adds all the required headers.

### SoapMain.main method:
1. SOAPConnectionFactory is a factory that creates SOAPConnection object to send and recieve SOAP messages.
2. create connection establishes a connection.
3. url has the connection endpoint
4. call() sends the request to the url.
5. close() closes the connection.

