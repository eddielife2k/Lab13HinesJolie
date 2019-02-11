public class CantileverBridge<E>extends CarBridge<E>
{
    private E cantileverLength;
  public CantileverBridge(String[] m, E l, E wL, E sL, int nL)
  {
      super(m, l, wL, sL, nL);
      cantileverLength = cL;
  }
  public void materials(String m){}
  public void length(E l) {}
  public void weightLimit(E lim) {}
  public void speedLimit(E lim) {}
  public void numLanes(int lanes) {}
  public void archRadius(E max){
    }
  public void archLength(E c){
    }
 public void cantileverLength(E length){
    cantileverLength = length;
    }
  public void tensions(double[] tensions) {}
}
