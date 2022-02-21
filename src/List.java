import java.util.Iterator;
public interface List<E>
{
    /**
     *
     * @return number of elements in list
     */
    int size();

    /**
     *
     * @return true if list has no elements
     */
     boolean isEmpty();

     /**
     * clears the list, leaves it with no elements
     */
     void clear();

    /**
     * add an element at the first position of the list
     * @param value value to be added to the first position
     */
     void addFirst(E value);

    /**
     * appends an element to the list
     * @param value value to be appended
     */
     void addLast(E value);

     /**
     * checks if the list is not empty, if it is not empty it returns the first value of the list
     * @return first value of the list
     */
     E getFirst();

     /**
     * checks if the list is not empty, if it is not empty, it returns the last value of the list
     * @return las value of the list
     */
     E getLast();

     /**
     * removes the first element of the list
     * @return returns the first element of the list and removes it from the list at the same time
     */
     E removeFirst();

     /**
     * removes the last element of the list
     * @return returns the last element of the list and removes it from the list at the same time
     */
     E removeLast();

     /**
     * removes and returns the value of an element equal to value
     * @param value element that will be removed
     * @return element equal to value, otherwise null
     */
     E remove(E value);

     /**
     * add the value in the parameter at the end/tail of the list
     * @param value
     */
     void add(E value);

     /**
     * checks if the list has at least one element, if true it removes the last element found in the list
     * @return last element found in the list
     */
     E remove();

     /**
     * checks if the list hast at least one element, if true, it returns the last element found in the list
     * @return last element found in the list
     */
     E get();

     /**
     * checks if the list is null, if false, returns an element equal to value
     * @param value value to be seeked in the list
     * @return element equal to value, else, null
     */
     boolean contains(E value);

     /**
     * checks if value is not null
     * @param value value to be seeked
     * @return index of the value, if value not found, ir returns -1
     */
     int indexOf(E value);

     /**
     * checks if value is not null
     * @param value value to be seeked
     * @return index of value in list, if value not found returns -1
     */
     int lastIndexOf(E value);

     /**
     * checks if parameter is greater or equal than 0 and smaller than the list's size
     * @param i index/position
     * @return element found at that position
     */
     E get(int i);

     /**
     * checks if parameter is greater or equal to 0 and smaller than list's size
     * @param i index/position
     * @param o value to be added
     * @return returns the old value at the i position, removes it from the list and add o to that position
     */
     E set(int i, E o);

     /**
     * checks if parameter i is greater or equal than 0 and smaller or equal to list's size, method consist on ad the o value, to the i index
     * @param i index/position
     * @param o value to be addded
     */
     void add(int i, E o);

     /**
     * removes an element of the list at the i position
     * @param i index/position
     * @return removes and return the element on the i position
     */
     E remove(int i);

     /**
     * returns an iterator allowing ordered traversal of elements in list
     * @return
     */
     Iterator<E> iterator();
}