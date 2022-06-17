package justAtestForJava.SingletonDP;

public class ThreadedTask extends Thread{
    private String TaskName;
    public ThreadedTask(String tsk){
         this.TaskName = tsk;
    }
    @Override
    public void run() {
        Singleton sg = Singleton.getInstance();
        sg.task(this.TaskName);
    }
} 
