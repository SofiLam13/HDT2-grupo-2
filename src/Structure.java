public interface Structure <E>{
    public int size();
    // post: computes number of elements contained in structure
    public boolean isEmpty();
    // post: return true iff the structure is empty

    public void add(E value);
    // pre: value is non-null
    // post: value has been added to the structure
    // replacement policy is not specified
    public Object remove(E value);
    // pre: value is non-null
    // post: an object equal to value is removed and returned, if found
}
