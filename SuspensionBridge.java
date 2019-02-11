public class SuspensionBridge<E>extends CarBridge<E>
{
   private double temp;
   double[] tensions;
  public SuspensionBridge(String[] m, E l, E wL, E sL, int nL, double[] tensions)
   {
       super(m, l, wL, sL, nL);
       this.tensions = tensions; 
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
  public void cantileverLength(E length){}
  public void tensions(double[] tensions) {
    for(int k = 0; k < tensions.length; k++){
    temp = tensions[k];
    tensions[k] = temp;
    }
  }
  public String returnTensions(){
      String temp = "";
      for(double str: tensions){
          temp += str + ", ";
        }
        return temp;
    }
}
