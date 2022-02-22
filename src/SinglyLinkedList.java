public class SinglyLinkedList<E> extends AbstractList<E> {
    protected int count;
    protected Node<E> head;

    public SinglyLinkedList(){
        count = 0;
        head = null;
    }

    public int Size(){
        //post: return amount of elements in List
        int elementcount = 0;
        Node finger = head;
        while(finger != null){
            elementcount++;
            finger = finger.next();
        }
        return elementcount;
    }

    public void addFirst(E value){
        head = new Node<E>(value,head);
        count++;
    }
    public E removeFirst(){
        Node<E> temp = head;
        head = head.next();
        count--;
        return temp.value();
    }
    public E getFirst(){
        return head.value();
    }

    public void addLast(E value){
        Node<E> temp = new Node<E>(value, null);
        if(head != null){
            Node<E> finger = head;
            while(finger.next() != null){
                finger = finger.next();
            }
            finger.setNext(temp);
        }else{
            head = temp;
        }
        count++;
    }

    public E removeLast()
    //pre: list is not empty
    //post: removes last value from list
    {
        Node<E> finger = head;
        Node<E> previous = null;
        if(head != null){
            System.out.println("La lista no esta vacia");
            while(finger.next() != null){
                previous = finger;
                finger = finger.next();
            }
            if(previous == null){
                head = null;
            }else{
                previous.setNext(null);
            }
            count--;
            return finger.value();
        }
        else{
            return null;
        }
    }



}