/**
 * Diego Vásquez - 211628
 */

public interface List<T> {

   public int size(); // Retorna el número de elementos en la lista

   public boolean isEmpty(); // Retorna si la lista no tiene elementos.

   public void add(T value); // Añade un elemento a la lista.

   public T remove(); // Remueve el último elemento de la lista.

   public T get(); // Retorna el último elemento de la lista.

}
