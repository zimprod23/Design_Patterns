package justAtestForJava.Strategy;

/**
 * StrategyPatternDemo
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context cxt = new Context(new Addition());
        System.out.println("10 + 12 :"+cxt.executeStrategy(10, 12));
        cxt = new Context(new Multiplication());
        System.out.println("10 * 12 :"+cxt.executeStrategy(10, 12));
        cxt = new Context(new Substraction());
        System.out.println("10 - 12 :"+cxt.executeStrategy(10, 12));
    }
}