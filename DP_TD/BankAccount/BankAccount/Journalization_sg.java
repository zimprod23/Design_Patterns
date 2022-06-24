package BankAccount;



public class Journalization_sg{

    private static final Journalization_sg sg;
    private String[] Logs = {"Accepted","Denied"};
    public static int holder = 0;
    static{
        sg = new Journalization_sg();
    }

    private Journalization_sg(){
        System.out.println("Constructer been called");
    }

    public static Journalization_sg get_Journal(){
        if(sg != null){
            return sg;
        }
        return null;
    }

    public void Ops(Account account){
        try{
            Thread.sleep(3500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        if(account.Trigger){
            System.out.println(" The auth of Mr/Ms :"+account.getName() +" | "+Logs[0]);
        }else{
            System.out.println(" The auth of Mr/Ms :"+account.getName() + " | "+Logs[1]);
        }
        }

    // public void get_logs(){
    //     try{
    //         Thread.sleep(1000);
    //     }catch(InterruptedException e){
    //         e.printStackTrace();
    //     }
    //   System.out.println(this.Log);
    // }
    // public void Add_logs(String lg){
    //   this.Log = lg;
    // }
}