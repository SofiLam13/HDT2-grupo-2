/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * doubly linked list, implements abstract AbstractList
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
    DoublyLinkedNode<E> head;
    DoublyLinkedNode<E> tail;

    public DoublyLinkedList(){
        head = new DoublyLinkedNode<E>(null);
        tail = new DoublyLinkedNode<E>(null,head);
        head.nextElement = tail;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void add(E value) {
        //pre: value is not null
        //post:adds value to structure data
        if(value == null){
            throw new NullPointerException();
        }else{
            DoublyLinkedNode<E> last_element = tail.previousElement;
            DoublyLinkedNode<E> temporal = new DoublyLinkedNode<E>(value,last_element,tail);
            tail.previousElement = temporal;
            last_element.nextElement = temporal;
            this.size++;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E remove(int i) {
        //pre: index is not greater or equal than size, and index is greater than 0
        //post:shows and removes element at index i
        if(i < 0 || i >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            if(i == size-1){
                return removeLast();
            }
            DoublyLinkedNode<E> actual_node = head;
            for(int n = 0;n<i;n++){
                actual_node = actual_node.nextElement;
            }
            DoublyLinkedNode<E> temporal = actual_node.nextElement;
            E value = temporal.data;
            actual_node.nextElement = temporal.nextElement;
            temporal.nextElement.previousElement = actual_node;
            this.size--;
            return value;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E get(int i) {
        //pre: index is not greater or equal than size, and index is greater than 0
        //post:shows element at index i
        if(i < 0 || i > size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            DoublyLinkedNode<E> actual_node = head;
            for(int n = 0;n<i;n++){
                actual_node = actual_node.nextElement;
            }
            return actual_node.nextElement.data;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E removeLast() {
        //pre: list is not empty
        //post: shows and removes last element at list
        if(size() == 0){
            throw new NullPointerException();
        }else{
            DoublyLinkedNode<E> last_element = tail.previousElement;
            last_element.previousElement.nextElement = tail;
            tail.previousElement = last_element.previousElement;
            this.size--;
            return last_element.data;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E peek() {
        //pre: list is not empty
        //post: shows las element
        if(size() == 0){
            throw new NullPointerException();
        }else{
            return tail.previousElement.data;
        }
    }

}
