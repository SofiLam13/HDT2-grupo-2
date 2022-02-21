import java.util.Iterator;
public class SingleLinkedList extends AbstractList {
    protected  int list_size; // list size
    protected Node head; //reference to first element

    /**
     * Generates an empty List
     */
    public SingleLinkedList(){
        head = null;
        list_size = 0;
    }

    /**
     *
     * @return the size of the list
     */
    public int Size(){
        return list_size;
    }
    @Override
    public void clear() {
    }

    @Override
    public void addFirst(Object value) {
        head = new Node(value, head);
        list_size++;
    }

    @Override
    public void addLast(Object value) {
        Node temp = new Node(value, null);
        if(head != null){
            Node finger = head;
            while(finger.getNextElement() != null){
                finger = finger.getNextElement();
            }
            finger.setNextElement(temp);
        }else{
            head = temp;
        }
        list_size++;
    }

    @Override
    public Object getFirst() {
        if(list_size > 0){
            return head.value();
        }else{
            return null;
        }
    }

    @Override
    public Object getLast() {
        return null;
    }

    /**
     * Removes first element in the list
     * @return value of the first element
     */
    @Override
    public Object removeFirst() {
        if(list_size > 0){
            Node temp = head;
            head = head.getNextElement();
            list_size--;
            return temp.value();
        }
        else{
            return null;
        }
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object remove(Object value) {
        return null;
    }

    @Override
    public void add(Object value) {

    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object get() {
        return null;
    }

    /**
     * Checks if object value is in the list
     * @param value value to be seeked in the list
     * @return true if value is not null and on the list, false if value is null or value not in the list
     */
    @Override
    public boolean contains(Object value) {
        if(value != null){
            Node finger = head;
            while(finger != null && !finger.value().equals(value)){
                finger = finger.getNextElement();
            }
            return finger != null;
        }else{
            return false;
        }
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
