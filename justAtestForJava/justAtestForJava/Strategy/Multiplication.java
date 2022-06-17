package justAtestForJava.Strategy;

/**
 * Multiplication
 */
public class Multiplication implements Strategy{
   @Override
   public int doOperation(int a, int b) {
       return a*b;
   }
}