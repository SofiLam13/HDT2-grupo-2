import java.util.Iterator;

public class DoublyLinkedList<E> extends AbstractList {

    protected  int list_size;
    protected DoublyLinkedListNode head;
    protected  DoublyLinkedListNode tail;

    public DoublyLinkedList(){
        this.list_size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void clear() {}

    @Override
    public void addFirst(Object value) {
        if(value != null){
         head = new DoublyLinkedListNode(value,head,tail);
         if(tail == null){
             tail = head;
         }
        }
        list_size++;
    }

    @Override
    public void addLast(Object value) {
        if(value != null){
            tail = new DoublyLinkedListNode(value,null,tail);
            if(head == null){
                head = tail;
            }
        }
        list_size++;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        if(list_size > 0){
            DoublyLinkedListNode temp = tail;
            tail = tail.Previous();
            if(tail == null){
                head = null;
            }else{
                tail.setNext(null);
            }
            list_size--;
            return (E) temp.Value();
        }
        else{
            return null;
        }
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

    @Override
    public boolean contains(Object value) {
        return false;
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
