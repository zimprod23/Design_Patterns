package Cars;

public class CarMain {
    public static void main(String[] args) {
        CarFactory car = new CarFactory();
        Car SpCar = car.getCar(900f);
        SpCar.Display_Car();
        //System.out.println(SpCar.getClass());
    }
} 
