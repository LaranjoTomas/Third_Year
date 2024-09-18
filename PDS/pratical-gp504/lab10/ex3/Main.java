package lab10.ex3;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Create a collection
        Collection<String> collection = new ArrayList<>();

        // Create an invoker
        Shortcut<String> shortcut = new Shortcut<>();

        // Create and set an AddingCommand
        Command<String> addCommand = new AddingCommand<>(collection, "Hello, World!");
        shortcut.setCommand("add", addCommand);

        // Execute the AddingCommand
        shortcut.execute("add");
        System.out.println(collection); // Outputs: [Hello, World!]

        // Undo the AddingCommand
        shortcut.undo("add");
        System.out.println(collection); // Outputs: []

        // Create and set a RemovingCommand
        Command<String> removeCommand = new RemovingCommand<>(collection, "Hello");
        collection.add("Hello"); // Add the element to be removed
        shortcut.setCommand("remove", removeCommand);

        // Execute the RemovingCommand
        shortcut.execute("remove");
        System.out.println(collection); // Outputs: []

        // Undo the RemovingCommand
        shortcut.undo("remove");
        System.out.println(collection); // Outputs: [Hello]
    }
}