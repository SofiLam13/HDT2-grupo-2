/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * single linked list extends abastract lists
 */
public class SingleLinkedList <E> extends AbstractList<E> {
    Node<E> head;
    int size;

    //creates a new linked list
    SingleLinkedList(){
        head = new Node<E>(null);
        size = 0;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void add(E item){
        if(item == null){
            throw new NullPointerException();
        }
        else{
            Node<E> actual_node = head;
            while(actual_node.nextElement != null){
                actual_node = actual_node.nextElement;
            }
            actual_node.nextElement = new Node<E>(item);
            this.size++;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E remove(int index){
        Node<E> actual_node = head;
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            for(int i = 0;i<index;i++){
                actual_node = actual_node.nextElement;
            }
            Node<E> temporal = actual_node.nextElement;
            actual_node.nextElement = temporal.nextElement;
            this.size--;
            return temporal.data;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E get(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            Node<E> actual_node = head;
            for(int i = 0; i<index;i++){
                actual_node = actual_node.nextElement;
            }
            return actual_node.nextElement.data;
        }
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E removeLast(){
        int index = size-1;
        return remove(index);
    }
    /**
     *{@inheritDoc}
     */
    @Override
    public E peek(){
        int index = size-1;
        return get(index);
    }

}
