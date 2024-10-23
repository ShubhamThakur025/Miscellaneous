package commands;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> history = new Stack<>();
    public void execCommand(Command command){
        command.execute();
        history.push(command);
    }
    public void undoCommand(){
        if(history.isEmpty()){
            System.out.println("There is nothing to undo");
            return;
        }
        Command command = history.pop();
        command.undo();
    }
}
