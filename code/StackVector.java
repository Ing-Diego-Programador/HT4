/**
 * Diego Vásquez - 211628
 */

import java.util.Vector;

public class StackVector<T> implements IStack<T>{   // Se crea un vector con un tipo de dato generico.

    Vector <T> stack = new Vector<T>();

    @Override
    public void push(T num) {
        stack.add(num);
    }

    @Override
    public boolean empty() {
        boolean cantidad = false;
        if (stack.size()==0){
            cantidad = true;
        }
        return cantidad;
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public T pop() {
        T num = peek();
        stack.removeElementAt(stack.size()-1);
        return num;
    }

    @Override
    public T peek() {
        return stack.get(stack.size()-1);
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pull'");
    }
}
