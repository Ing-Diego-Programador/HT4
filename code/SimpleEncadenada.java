public class SimpleEncadenada<T> extends AbstractClassList<T> {

    protected int count;
    protected Nodo<T> head; 
 
    public SimpleEncadenada() {
       head = null;
       count = 0;
    }
 
    @Override
    public int size() {
        return count;
    }
 
    @Override
    public void add(T value) {

       Nodo<T> temp = new Nodo<T>(value,null);

       if (head != null) {
          Nodo<T> p = head;
          while (p.next() != null)
          {
                 p = p.next();
          }
 
          p.setNext(temp);
       } else head = temp;
 
       count++;
    }
 
    @Override
    public T remove() {
        Nodo<T> temp = head;
        head = head.next();
        count--;
        return temp.value();
 
     }
 
    @Override
    public T get() {
        return head.value();
 
     }
 
 }
