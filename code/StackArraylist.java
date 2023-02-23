import java.util.ArrayList;

public class StackArraylist<T> implements IStack<T>{

    ArrayList <T> stack = new ArrayList<T>();

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
        stack.remove(stack.size()-1);
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

