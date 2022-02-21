import java.util.Vector;

public class MyStackVector implements  Stack{
    private Vector vector;

    MyStackVector(Vector v){
        this.vector = v;
    }

    @Override
    public void add(Object item) {
        vector.addElement(item);
    }

    @Override
    public Object remove() {
        if(vector.isEmpty() == false){
            Vector temp = (Vector) vector.elementAt(vector.size());
            vector.remove(vector.size());
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public Object peek() {
        return vector.elementAt(vector.size());
    }

    @Override
    public boolean empty() {
        if(vector.isEmpty() == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return vector.size();
    }
}
