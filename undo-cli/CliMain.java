import commands.AddTextCommand;
import commands.Command;
import commands.CommandManager;

public class CliMain{
    public static void main(String[] args) {
        StringBuilder document = new StringBuilder();
        CommandManager commandManager = new CommandManager();

        Command addText = new AddTextCommand(document, "Hello");
        commandManager.execCommand(addText);
        System.out.println(document);
        addText = new AddTextCommand(document, " World!");
        commandManager.execCommand(addText);
        System.out.println(document);
        commandManager.undoCommand();
        System.out.println(document);
        commandManager.undoCommand();
        commandManager.undoCommand();
    }
}