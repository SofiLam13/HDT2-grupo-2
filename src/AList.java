public interface AList<E>{
    public int size();
    public void add(E value);
    public E remove(int i);
    public E get(int i);
    public E removeLast();
    public E peek();

}
