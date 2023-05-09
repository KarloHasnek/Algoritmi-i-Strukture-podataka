package undoredo;

public class CommandCLS {
    
    private String command;

    public CommandCLS(String cmd){
        this.command = cmd;
    }

    @Override
    public String toString() {
        return "[command=" + command + "]";
    }
}
