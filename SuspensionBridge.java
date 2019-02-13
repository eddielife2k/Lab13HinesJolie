public class SuspensionBridge<E> extends CarBridge<E>
{
  private double[] tensions = new double[2];
  public SuspensionBridge(String[] m, E l, E wL, E sL, int nL, double[] t)
   {
       super(m, l, wL, sL, nL);
       for( int k = 0; k < tensions.length; k++ ) {
           tensions[k] = t[k];
       }
   }
  public void archRadius(E max){}
  public void archLength(E c){}
  public void cantileverLength(E length){}
  public void tensions(double[] tensions) {}
  public String returnTensions() {
      String temp = "[";
      for( double dob : tensions ) {
          temp += dob + ", ";
      }
      temp += "]";
      return temp;
  }
  public String toString() {
      String temp = "";
      temp += returnMaterials() + "\n";
      temp += "The weight limit is " + returnWeightLimit() + ".\n";
      temp += "The length is " + returnLength() + ".\n";
      temp += "The speed limit is " + returnSpeedLimit() + ".\n";
      temp += "The number of lanes are " + returnNumLanes() + ".\n";
      temp += returnTensions();
      return temp;
  }
}
