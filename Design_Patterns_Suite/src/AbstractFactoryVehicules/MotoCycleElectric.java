package AbstractFactoryVehicules;

public class MotoCycleElectric implements Vehicule{

    @Override
    public void describe(String brandName) {
        System.out.println("Serie yyyy "+ brandName+" version Electric");
    }
}
