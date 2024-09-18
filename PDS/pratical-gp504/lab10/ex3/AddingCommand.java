package lab10.ex3;

import java.util.Collection;

public class AddingCommand<E> implements Command<E> {

    private Collection<E> collection;
    private E element;

    public AddingCommand(Collection<E> collection, E element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.add(element);
    }

    @Override
    public void undo() {
        collection.remove(element);
    }
}