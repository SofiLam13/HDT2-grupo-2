/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * Abstract class to implement interface AList<E>
 */
public abstract class AbstractList<E> implements AList<E> {
    protected int size = 0;

    /**
     * tells the size of the list
     * @return size
     */
    public int size(){
        return size;
    }
}
