import java.util.Vector;

public class StackVector<E> extends AbstractStack<E>{
    Vector<E> vector;

    StackVector(){
        vector = new Vector<E>();
    }
    @Override
    public void add(Object item) {
        //appends element to the vector
        E eItem = (E)item;
        vector.add(eItem);
    }

    @Override
    public E pop() {
        //pre: vector is not empty
        //post: gets and removes last element
        if(!vector.isEmpty()){
            E temp = vector.elementAt(size()-1);
            vector.removeElementAt(size()-1);
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public E peek() {
        //pre: vector is not empty
        //post: gets the last element
        if(!vector.isEmpty()){
            return vector.elementAt(size()-1);
        }else{
            return null;
        }
    }

    @Override
    public int size() {
        return vector.size();
    }
}
