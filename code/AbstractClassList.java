/**
 * Diego Vásquez - 211628
 */

public class AbstractClassList<T> implements List<T> {

   public AbstractClassList() {
   }

   /**
    * @return boolean
    * Retorna si la lista está vacía.
    */
   public boolean isEmpty() {
      return size() == 0;
   }

@Override
public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
}

@Override
public void add(T value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}

@Override
public T remove() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
}

@Override
public T get() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
}
}
