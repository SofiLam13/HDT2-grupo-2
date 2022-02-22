public interface List<E> extends Structure<E> {

 public int size();
 //post: number of elements in the list

 public boolean isEmpty();
 //post: return if the list has no elements

 public void addLast(E value);
 //post: value is added to the end of the list

 public void addFirst(E value);
 //post: value is added to the top of the list

 public E getFirst();
 //pre: list is not empty
 //post: returns first element of the list

 public E getLast();
 //pre: list is not empty
 //post: returns last element of the list

 public E removeFirst();
 //pre: list is not empty
 //post: returns and removes first element of the list

 public E removeLast();
 //pre: list is not empty
 //post: returns and removes last element of the list

 public E remove(E value);
 //pre: list is not empty and value is on the list
 //post: removes element equal to value

}