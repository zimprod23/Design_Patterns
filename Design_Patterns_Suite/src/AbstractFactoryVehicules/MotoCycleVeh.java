package AbstractFactoryVehicules;

public class MotoCycleVeh extends AbstractFactory{
    
    @Override
    public Vehicule getVehicule(String EnergySource) {
        switch(EnergySource.toLowerCase()){
            case "essence":return new MotoCycleEssence();
            case "electric":return new MotoCycleElectric();
            default : return null;
         }    
    }
}
