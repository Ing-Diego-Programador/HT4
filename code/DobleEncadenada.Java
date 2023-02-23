/**
 * Diego Vásquez - 211628
 */

public class DobleEncadenada<T> extends AbstractClassList<T> {

    public int c;
    public DoublyLinkedNode<T> in;
    public DoublyLinkedNode<T> out;

    public DoublyLinkedList() {
        in = null;
        out = null;
        i = 0;
    }


    /**
     * @return int
     */
    @Override
    public int size() {
        return i;
    }


    /**
     * @param value
     */
    @Override
    public void add(T value) {
        in = new DoublyLinkedNode<T>(value, in, null);
        if (out == null) out = in;
        i++;
    }


    /**
     * @return T
     */
    @Override
    public T remove() {

        DoublyLinkedNode<T> temp = in;
        in = in.next(); // move in down list
        i--;
        return temp.value();
    }


    /**
     * @return T
     */
    @Override
    public T get() {
        return in.get();
    }

}