package lab10.ex1;

public interface InterfaceMain<E> {
    public java.util.Iterator<E> Iterator(); 
    public java.util.ListIterator<E> listIterator(); 
    public java.util.ListIterator<E> listIterator(int index);
}
