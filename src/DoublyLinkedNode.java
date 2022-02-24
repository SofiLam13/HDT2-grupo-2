/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * Node for double linked list
 */
public class DoublyLinkedNode<E>{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    DoublyLinkedNode(E v){
        data = v;
    }
    DoublyLinkedNode(E v,DoublyLinkedNode<E> prev){
        this(v);
        previousElement = prev;
    }
    DoublyLinkedNode(E v,DoublyLinkedNode<E> prev,DoublyLinkedNode<E> next){
        this(v,prev);
        nextElement = next;
    }
}
