package lab10.ex3;

import java.util.HashMap;
import java.util.Map;

public class Shortcut<E> {

    private Map<String, Command<E>> commands = new HashMap<>();

    public void setCommand(String key, Command<E> command) {
        commands.put(key, command);
    }

    public void execute(String key) {
        Command<E> command = commands.get(key);
        if (command != null) {
            command.execute();
        }
    }

    public void undo(String key) {
        Command<E> command = commands.get(key);
        if (command != null) {
            command.undo();
        }
    }
}