package AbstractFactoryVehicules;

public class CarEssence implements Vehicule{

    @Override
    public void describe(String brandName) {
        System.out.println("Serie xxxx "+brandName+" version Essence");
    }
    
}
