/**
 * Diego Vásquez - 211628
 */

public class DobleEncadenadaNodo<T> {

        public DobleEncadenadaNodo<T> next;
        public DobleEncadenadaNodo<T> ant;
        public T data;
    
        public DobleEncadenadaNodo(T d, DobleEncadenadaNodo<T> next,DobleEncadenadaNodo<T> ant){
            d = data;
            next = next;
            if (next != null)
                next.ant = this;
                ant = ant;
            if (ant != null)
                ant.next = this;
        }
    
        public DobleEncadenadaNodo(T d){
            this(d,null,null);
        }
    
        public DobleEncadenadaNodo<T> next() { // Retorna la referencia al próximo nodo.
           return next;
        }
    
        public void setNext(DobleEncadenadaNodo<T> next) {
          next = next;
       }
    
       public T value() {
          return data;
       }
    
       public void setValue(T value) {
          data = value;
       }
    
        public DobleEncadenadaNodo<T> previous() {
            return null;
        }

        public T get() {
            return null;
        }
    }
