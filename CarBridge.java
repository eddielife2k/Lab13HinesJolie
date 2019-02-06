public abstract class CarBridge<E> implements Bridge<E>
{
    private E length;
    private String materials;
    private E weightLimit;
    public CarBridge(String m, E l, E wL) {
        materials = m;
        length = l;
        weightLimit = wL;
    }
    public void materials(String m) {
    }
    public String returnMaterials() {
        return "";
    }
    public void length(E length) {
    }
    public E returnLength() {
        return length;
    }
    public void weightLimit(E lim) {
    }
    public E returnWeightLimit() {
        return weightLimit;
    }
}
