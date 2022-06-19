package AbstractFactoryVehicules;

public class CarElectric implements Vehicule{

    @Override
    public void describe(String brandName) {
        System.out.println("Serie xxxx "+brandName+" version Electric");
    }
    
}
