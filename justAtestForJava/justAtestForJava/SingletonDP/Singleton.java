package justAtestForJava.SingletonDP;


public class Singleton{

    public static final Singleton sg;
    public static int cpt=0;
    static {
        sg = new Singleton();
    }

    private Singleton(){
        System.out.println("**********constructor is called here");
    };

    public static Singleton getInstance(){
        return sg;
    }
    public  void task(String taskname){
        System.out.println("---------- Biggining of task -----------"+taskname);
        for(int i=0;i<5;i++){
        synchronized(this){
            ++cpt;
        }
        System.out.println("Counter is : "+cpt);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

        System.out.println("---------- End of traitment -----------"+cpt);
    }
} 