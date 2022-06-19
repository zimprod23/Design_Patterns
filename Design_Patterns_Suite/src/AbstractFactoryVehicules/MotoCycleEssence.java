package AbstractFactoryVehicules;

public class MotoCycleEssence implements Vehicule{

    @Override
    public void describe(String brandName) {
        System.out.println("Serie yyyy "+brandName+" version Essence");
    }
    
}
