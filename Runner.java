
public class Runner
{
    public static void main(String[] args) {
        String[] materials = {"Concrete", "Stone", "Asphalt"};
        CarBridge<Integer> b1 = new ArchBridge<Integer>( materials, 500, 2500, 40, 2, 400, 128 );
        b1.speedLimit(45);
        System.out.println(b1);
   }
}
