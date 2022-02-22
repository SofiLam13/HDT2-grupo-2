public class DoublyLinkedList<E> extends AbstractList<E> {
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }
    public void addFirst(E value){
        head = new DoublyLinkedNode<E>(value,head,null);
        if(tail == null){
            tail = head;
        }
        count++;
    }
    public void addLast(E value){
        tail = new DoublyLinkedNode<E>(value,null,tail);
        count++;
    }
    public E removeLast(){
        if(!isEmpty()) {
            System.out.println("La lista no esta vacia");
            DoublyLinkedNode<E> temp = tail;
            tail = tail.previous();
            tail.setNext(null);
            count--;
            return  temp.value();
        }else{
            return null;
        }
    }

}
