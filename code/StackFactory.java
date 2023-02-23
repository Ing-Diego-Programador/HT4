
public class StackFactory {

    public IStack implementacion(String lista){
        if(lista.equals("Vector")){
            return new  StackArraylist<Integer>();
        }else if(lista.equals("ArrayList")){
            return new StackVector<Integer>();
        }
        return null;
    }
}
