public abstract class AbstractList <E> implements  List<E> {
    private List list;
    public AbstractList(){}

    @Override
    public int size() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        if(size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void add(E value) {
        list.add(value);
    }

    @Override
    public void addLast(E value) {
        list.addLast(value);
    }

    @Override
    public void addFirst(E value) {
        list.addFirst(value);
    }

    @Override
    public E getFirst() {
        if(list.size()>0){
            E element = (E) list.getFirst();
            return element;
        }
        else{
            return null;
        }
    }

    @Override
    public E getLast() {
        if(list.size() > 0){
            E element = (E) list.getLast();
            return element;
        }else{
            return null;
        }
    }

    @Override
    public E removeFirst() {
        if(list.size() > 0){
            E temp = (E) list.getFirst();
            list.removeFirst();
            return temp;
        }
        else{
            return null;
        }
    }

    @Override
    public E removeLast() {
        if(list.size() > 0){
            E temp = (E) list.getLast();
            list.removeLast();
            return temp;
        }
        else{
            return null;
        }
    }

    @Override
    public E remove(E value) {
        Object val = (Object) value;
        if(list.size() > 0 && list.equals(val)){
            list.remove(val);
            return value;
        }
        else{
            return null;
        }
    }
}

