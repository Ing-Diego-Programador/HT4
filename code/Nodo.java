/**
 * Diego Vásquez - 211628
 */

public class Nodo<T> {
    protected Nodo<T> nextElement;
    protected T data;

   public Nodo(T val, Nodo<T> next) {   // Nueva cabeza de lista.
       data = val;
       nextElement = next;
   }

   public Nodo(T val) { // Nueva cola.
      this(val,null);
   }

   public Nodo<T> next() { //Referencia al próximo valor en la lista.
      return nextElement;
   }

   public void setNext(Nodo<T> next) {
      nextElement = next;
   }

   public T value() {
      return data;
   }

   public void setValue(T value) {
      data = value;
   }
}
