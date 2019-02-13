
public class Runner
{
    public static void main(String[] args) {
        String[] materials = {"Concrete", "Stone", "Asphalt"};
        CarBridge<Integer> b1 = new ArchBridge<Integer>( materials, 500, 2500, 40, 2, 400, 128 );
        b1.speedLimit(45);
        System.out.println(b1);
        CarBridge<String> b2 = new CantileverBridge<String>( materials, "Very Long", "that their can't be trucks", 
        "no faster than highway limit of 65", 4, "50 feet long" );
        System.out.println(b2);
        double[] tensions = {55.64, 55.33};
        CarBridge<Integer> b3 = new SuspensionBridge<Integer>( materials, 500, 2500, 40, 2, tensions );
        System.out.println(b3);
   }
}
