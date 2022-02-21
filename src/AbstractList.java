import java.util.Arrays;

public abstract class AbstractList<E> implements List{
    public AbstractList(){}

    /**
     * Return the size
     * @return size
     */
    public int size(){
        return size();
    }

    /**
     * checks if the the size of the dinamic structure size is zero, size = 0, true, else false
     * @return true if size = 0; else false
     */
    public boolean isEmpty(){
        if(size() != 0){
            return false;
        }
        else{
            return true;
        }
    }


}
