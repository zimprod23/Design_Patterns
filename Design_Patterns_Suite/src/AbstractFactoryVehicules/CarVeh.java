package AbstractFactoryVehicules;

public class CarVeh extends AbstractFactory{

    @Override
    public Vehicule getVehicule(String EnergySource) {
         switch(EnergySource.toLowerCase()){
            case "essence":return new CarEssence();
            case "electric":return new CarElectric();
            default : return null;
         }
    }
    
}
