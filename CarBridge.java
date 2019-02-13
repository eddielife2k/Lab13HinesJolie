public abstract class CarBridge<E> implements Bridge<E>
{
    private E length;
    private String[] materials = new String[3];
    private E weightLimit;
    private E speedLimit;
    private int numLanes;
    
    public CarBridge(String[] m, E l, E wL, E sL, int nL) {
        String temp;
        if( m.length > materials.length ) {
            System.out.println("Only three materials please!");
        }
        for( int k = 0; k < materials.length; k++ ) {
           materials[k] = m[k];
        }
        length = l;
        weightLimit = wL;
        speedLimit = sL;
        numLanes = nL;
    }
    public void materials(String[] m) {
        if( m.length > materials.length ) {
            System.out.println("Only three materials please!");
        }
        m = materials;
    }
    public String returnMaterials() {
        String temp = "[ ";
        for(String str: materials) {
            temp += str + ", ";
        }
        temp += "]";
        return temp;
    }
    public void length(E l) {
        length = l;
    }
    public E returnLength() {
        return length;
    }
    public void weightLimit(E lim) {
        weightLimit = lim;
    }
    public E returnWeightLimit() {
        return weightLimit;
    }
    public void speedLimit(E lim){
        speedLimit = lim;
    }
    public E returnSpeedLimit() {
        return speedLimit;
    }
    public void numLanes(int lanes) {
        numLanes = lanes;
    }
    public int returnNumLanes() {
        return numLanes;
    }
    public abstract void archRadius(E aR);
    public abstract void archLength(E aL);
    public abstract void cantileverLength(E length);
    public abstract void tensions(double[] tensions);
}
