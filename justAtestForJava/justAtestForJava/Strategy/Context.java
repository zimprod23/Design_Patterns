package justAtestForJava.Strategy;


/**
 * Context
 */
public class Context {

    private Strategy stry;
    public Context(Strategy s){
        this.stry = s;
    }
    public int executeStrategy(int a,int b){
       return stry.doOperation(a, b);
    }
    
}