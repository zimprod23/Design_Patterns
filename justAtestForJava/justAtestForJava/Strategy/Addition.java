package justAtestForJava.Strategy;

public class Addition  implements Strategy{
    @Override
    public int doOperation(int a, int b) {
       return a+b;
    }
}
