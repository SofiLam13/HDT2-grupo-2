public class Node<E> {
    protected E data; //value stored in this element
    protected Node<E> nextElement; // reference to next element

    Node(E value, Node<E> next_element){
        this.data = value;
        this.nextElement = next_element;
    }

    /**
     * if the reference of the next node is null, then it's value will become the value in the parameter
     * @param value generic value to be added in the tail of the list
     */
    public Node(E value){
        if(nextElement == null){
            this.data = value;
        }
    }

    /**
     * returns the reference of the next value in the list
     * @return reference of the next value
     */
    public Node<E> getNextElement() {
        return nextElement;
    }

    /**
     * set reference to new next value
      * @param NextReference
     */
    public void setNextElement(Node<E> NextReference){
        nextElement = NextReference;
    }

    /**\
     * returns the value associated with this element
     * @return value associated
     */
    public E value(){
        //if the reference is null, then it does not return a value at all
        if(nextElement != null){
            return data;
        }
        else{
            //if the reference of the next element is not  null, it returns the value of that reference
            return null;
        }
    }

    /**
     * if the reference is not null, then the value is set with the associated element
     * @param value
     */
    public void setValue(E value){
        if(nextElement != null){
            data = null;
        }
        else{
            data = value;
        }
    }

}
