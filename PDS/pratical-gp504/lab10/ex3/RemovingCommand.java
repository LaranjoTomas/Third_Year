package lab10.ex3;

import java.util.Collection;

public class RemovingCommand<E> implements Command<E> {

    private Collection<E> collection;
    private E element;

    public RemovingCommand(Collection<E> collection, E element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.remove(element);
    }

    @Override
    public void undo() {
        collection.add(element);
    }
}