package Cars;

public class CarFactory {
    public Car getCar(Float budget){
        if(budget<1000){
            return new Fiat();
        }else if((budget>2000) && (budget<3000)){
            return new Pegeot();
        }else{
            return new Bmw();
        }
        // if(budget<1000){
        //     return new Fiat();
        // }else if((budget > 1000) && (budget < 1999)){
        //     return new Pegeot();
        // }else if(budget > 2000){
        //     return new Bmw();
        // }else{
        //     return null;
        // } 
    }
}
