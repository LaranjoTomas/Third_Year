package lab10.ex1;

public class Main {
    public static void main(String[] args) {
        VectorGeneric<Long> vector = new VectorGeneric<Long>();

        vector.addElem(1L);
        vector.addElem(2L);
        vector.addElem(3L);

        java.util.Iterator<Long> iterator_vector = vector.Iterator();
        while (iterator_vector.hasNext()) {
            System.out.println("iterator_vector: " + iterator_vector.next());
        }

        java.util.ListIterator<Long> list_iterator_vector = vector.listIterator();
        while (list_iterator_vector.hasNext()) {
            System.out.println("list_iterator_vector: " + list_iterator_vector.next());
        }

        java.util.ListIterator<Long> list_iterator_vector_index = vector.listIterator(1);
        while (list_iterator_vector_index.hasNext()) {
            System.out.println("list_iterator_vector_index: " + list_iterator_vector_index.next());
        }
    }
}
