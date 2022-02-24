/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @author Dariel Villatoro
 *
 * class that extends abstract stack
 */

import java.util.ArrayList;

public class StackArrayList <E> extends AbstractStack{
    private ArrayList<E> array;
    StackArrayList(){
        //post: empty arraylist
        array = new ArrayList<E>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Object item) {
    //post: item is appended to the arraylist
        E eItem = (E)item;
        array.add(eItem);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public E pop() {
        //pre: ArrayList not empty
        //post: gets and removes last element
        if(!array.isEmpty()){
            return array.remove(size()-1);
        }else{
            return null;
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public E peek() {
        //pre: ArrayList not empty
        //post: gets the last element
        if(!IsEmpty()){
            return array.get(size()-1);
        }else{
            return null;
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return  array.size();
    }
}
