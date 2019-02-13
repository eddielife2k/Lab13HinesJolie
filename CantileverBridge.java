public class CantileverBridge<E>extends CarBridge<E>
{
    private E cantileverLength;
 public CantileverBridge(String[] m, E l, E wL, E sL, int nL, E cL)
  {
      super(m, l, wL, sL, nL);
      cantileverLength = cL;
  }
 public void archRadius(E max){
    }
 public void archLength(E c){
    }
 public void cantileverLength(E length){
    cantileverLength = length;
    }
 public E returnCantileverLength(){
        return cantileverLength;
    }
 public void tensions(double[] tensions) {}
 public String toString(){
     String temp = "";
     temp += returnMaterials() + ".\n";
     temp += "The weight limit is " + returnWeightLimit() + ".\n";
     temp += "The length is " + returnLength() + ".\n";
     temp += "The speed limit is " + returnSpeedLimit() + ".\n";
     temp += "The number of lanes are " + returnNumLanes() + ".\n";
     temp += "The cantilever length is " + returnCantileverLength() + ".\n";
    }
}
