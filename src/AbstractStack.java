/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * Abstract class to implement interface stack
 */
public abstract class AbstractStack<E> implements  AStack{
    /**
     * tells if stack is empty or not
     * @return true if size is 0, false if not
     */
    public boolean IsEmpty(){
        return size() == 0;
    }
}
