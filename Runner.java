
public class Runner
{
    public static void main(String[] args) {
        String[] materials = {"Concrete", "Stone"};
        Bridge<Integer> bl = new ArchBridge<Integer>( materials, 500, 2500, 40, 2, 400, 128 );
        bl.speedLimit(45);
   }
}
