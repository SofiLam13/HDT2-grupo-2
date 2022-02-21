public class DoublyLinkedListNode<E> {
    protected E data;
    protected DoublyLinkedListNode<E> nextElement;
    protected  DoublyLinkedListNode<E> previousElement;

    public DoublyLinkedListNode(E value,DoublyLinkedListNode<E> next,DoublyLinkedListNode<E> prev){
        this.data = value;
        this.nextElement = next;
        if(this.nextElement != null){
            nextElement.previousElement = this;
        }
        this.previousElement = prev;
        if(this.previousElement != null){
            previousElement.nextElement = this;
        }
    }
    public DoublyLinkedListNode(E v){
        this(v,null,null);
    }
    public DoublyLinkedListNode<E> Previous(){
        return this.previousElement;
    }
    public DoublyLinkedListNode<E> setNext(DoublyLinkedListNode value){
        return value;
    }
    public E Value(){
        if(nextElement != null){
            return data;
        }
        else{
            return null;
        }
    }
}
