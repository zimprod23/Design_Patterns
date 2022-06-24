package BankAccount;
import java.util.*;

class Account{
    private static final Map user_auth =  new HashMap();
    static {
        user_auth.put("username","ezzoubeir");
        user_auth.put("pass","pass");
    }
    private String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    private String Pass;
    public String getPass() {
        return Pass;
    }
    public void setPass(String pass) {
        Pass = pass;
    }
    public boolean Trigger;
    
    public boolean Verfy(){
        return ((this.Name == user_auth.get("username")) && (this.Pass == user_auth.get("pass")));
    }
    public Account(String user,String pass){
           this.Name = user;
           this.Pass = pass;
           this.Trigger = Verfy();
    }
    public Account(Account acc){
           this.Name = acc.getName();
           this.Pass = acc.getPass();
           this.Trigger = Verfy();
    }

}