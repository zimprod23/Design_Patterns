package AbstractFactoryVehicules;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
       AbstractFactory car = FactoryofVehFactory.getFactory("car");
       AbstractFactory scooter = FactoryofVehFactory.getFactory("moto");

       Vehicule PeugotEssence = car.getVehicule("essence");
       Vehicule HondaElectric = scooter.getVehicule("electric");

       PeugotEssence.describe("peugeot");
       HondaElectric.describe("Honda");
    }
}
