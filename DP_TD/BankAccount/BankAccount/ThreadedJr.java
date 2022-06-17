package  BankAccount;

public class ThreadedJr extends Thread{
    public Account acc;
    public ThreadedJr(Account acc){
           this.acc = new Account(acc);
    }
    @Override
    public void run() {
        Journalization_sg sg = Journalization_sg.get_Journal();
        sg.Ops(this.acc);
    }
}
