import java.util.LinkedList;

public class SingleLinkedList <E>{
    Node<E> head;
    int size;

    //creates a new linked list
    SingleLinkedList(){
        head = new Node<E>(null);
        size = 0;
    }
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

    public E removeLast(){
        int index = size-1;
        return remove(index);
    }
    public E peek(){
        int index = size-1;
        return get(index);
    }

}
