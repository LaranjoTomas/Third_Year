package lab10.ex1;

public class ListIterator<E> implements java.util.ListIterator<E> {
    private E[] vec;
    private int nElem;
    private int current = 0;

    public ListIterator(E[] vec2, int nElem, int current) {
        this.vec = vec2;
        this.nElem = nElem;
        this.current = current;
    }

    public ListIterator(E[] vec2, int nElem) {
        this(vec2, nElem, 0);
    }

    public boolean hasNext() {
        return current < nElem;
    }

    public E next() {
        return vec[current++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasPrevious() {
        return current > 0;
    }

    public E previous() {
        return vec[current--];
    }

    public int nextIndex() {
        return current + 1;
    }

    public int previousIndex() {
        return current - 1;
    }

    public void set(E e) {
        vec[current] = e;
    }

    public void add(E e) {
        throw new UnsupportedOperationException();
    }
}
