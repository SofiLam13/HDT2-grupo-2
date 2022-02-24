/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * interface Alist
 */
public interface AList<E>{
    /**
     * gets size of the list
     * @return size
     */
    public int size();

    /**
     * appends value to the list
     * @param value value to be appended
     */
    public void add(E value);

    /**
     * eliminates last element of a list
     * @param i index
     * @return element removed
     */
    public E remove(int i);

    /**
     * retrieves element at specified index
     * @param i index
     * @return element at index i
     */
    public E get(int i);

    /**
     * removes the last element of the list
     * @return last element of list
     */
    public E removeLast();

    /**
     * gets the last element of a list
     * @return last element of the list
     */
    public E peek();

}
