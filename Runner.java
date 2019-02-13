
public class Runner
{
    public static void main(String[] args) {
        String[] materials = {"Concrete", "Stone", "Asphalt"};
        CarBridge<Integer> bl = new ArchBridge<Integer>( materials, 500, 2500, 40, 2, 400, 128 );
        bl.materials(materials);
        System.out.println(bl.returnMaterials());
        bl.speedLimit(45);
   }
}
