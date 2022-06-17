package justAtestForJava.SingletonDP;

public class DemoSingleton {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            ThreadedTask ts = new ThreadedTask("task"+i);
            ts.start();
        }
    }
} 