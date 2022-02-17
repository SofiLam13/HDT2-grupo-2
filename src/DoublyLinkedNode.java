public class DoublyLinkedNode<E>
{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
// post: constructs a single element
    {
        this(v,null,null);
    }

    public DoublyLinkedNode<E> previous() {
        //cambiar codigo, se agrego este metodo para que no hubieran conflictos con doubly linked list
        return null;
    }

    public void setNext(Object o) {
        //cambiar codigo, se agrego este metodo para que no hubieran conflictos con doubly linked list
    }

    public E value() {
        //cambiar codigo, se agrego este metodo para que no hubieran conflictos con doubly linked list
        return null;
    }
}