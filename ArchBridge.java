
public class ArchBridge<E> extends CarBridge<E>
{
  private E archLength;
  private E archRadius;
  public ArchBridge(String[] m, E l, E wL, E sL, int nL, E aL, E aR)
    {
        super(m,l,wL,sL,nL);
        archLength = aL;
        archRadius = aR;
    }
  public void materials(String m){}
  public void length(E l) {}
  public void weightLimit(E lim) {}
  public void speedLimit(E lim) {}
  public void numLanes(int lanes) {}
  public void archRadius(E aR){
      archRadius = aR;
  }
  public void archLength(E aL){
      archLength = aL;
  }
  public E returnArchLength() {
      return archLength;
  }
  public E returnArchRadius() {
      return archRadius;
  }
  public void cantileverLength(E length){}
  public void tensions(double[] tensions) {}
}
