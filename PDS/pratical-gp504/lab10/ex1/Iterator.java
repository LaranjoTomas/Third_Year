package lab10.ex1;

public class Iterator<E> implements java.util.Iterator<E> {
    private E[] vec;
    private int nElem;
    private int current = 0;

    public Iterator(E[] vec2, int nElem) {
        this.vec = vec2;
        this.nElem = nElem;
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
}
