public class Node<E> {
    protected E data; //value stored in this element
    protected Node<E> nextElement; // reference to next element

    public Node(E value, Node<E> next){
        //pre: value is a value, next is a reference to remainder of list
        //pro: an element is constructed as the new head of list
        data = value;
        nextElement = next;
    }

    public Node(E value){
        //post: Construct a new tail of a list with value value
        this(value,null);
    }


}