import java.util.ArrayList;
import java.util.Vector;

public class FactoryType<E> {

    FactoryType(){}

    public Stack<E> getStack(int i){
        Stack<E> StackToBe = null;
        switch (i){
            case 1:
                ArrayList<E> array = new ArrayList<E>();
                MyStack stackA = new MyStack(array);
                StackToBe = stackA;

                break;
            case 2:
                Vector<E> vector = new Vector<E>();
                MyStackVector stackV = new MyStackVector(vector);
                StackToBe = stackV;
                break;
        }
        return StackToBe;
    }

    public List<E> getList(int n){
        List<E> ListToBe = null;
        switch (n){
            case 1:
                SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<E>();
                ListToBe = singlyLinkedList;
                break;
            case 2:
                DoublyLinkedList<E> doublyLinkedList = new DoublyLinkedList<E>();
                ListToBe = doublyLinkedList;
                break;
        }
        return ListToBe;
    }
}
