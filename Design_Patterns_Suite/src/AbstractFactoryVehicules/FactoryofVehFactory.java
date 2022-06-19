package AbstractFactoryVehicules;

public class FactoryofVehFactory {
    public static AbstractFactory getFactory(String VehType){
        switch(VehType.toLowerCase()){
             case "car":return new CarVeh();
             case "moto": return new MotoCycleVeh();
             default : return null;
        }
    }
    
}
