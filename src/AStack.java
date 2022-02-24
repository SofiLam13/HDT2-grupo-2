/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * interface stack
 */
public interface AStack <E> {

    /**
     * adds an element to the top of the stack
     * @param item item to be added
     */
    public void add(E item);

    /**
     * gets and removes element at the top of the stack
     * @return last element
     */
    public E pop();

    /**
     * gets the element at the top of the stack, without removing it
     * @return last element at the stack
     */
    public E peek();

    /**
     * tells wether the stack is empty or not
     * @return false if it is empty, true if stack is not empty
     */
    public boolean IsEmpty();

    /**
     * tells the current size of the stack
     * @return size of stack
     */
    public int size();
}
