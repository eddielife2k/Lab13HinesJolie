public interface Bridge<E> {
    public void materials(String m);
    public String returnMaterials();
    public void length(E length);
    public E returnLength();
    public void weightLimit(E lim);
}
