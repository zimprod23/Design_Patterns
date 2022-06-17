package BankAccount;
public class Demo {
    public static void main(String[] args) {
        String[] user = {"user1","ezzoubeir","ezzoubeir","user1","ezzoubeir","ezzoubeir"};
        String[] pass = {"pass","dragon","pass","pass","dragon","pass"};
        Account[] Logs = {new Account(user[0], pass[0]),new Account(user[1], pass[1]),new Account(user[2], pass[2]),new Account(user[3], pass[3]),new Account(user[4], pass[4]),new Account(user[5], pass[5])};
        for(Account lg : Logs){
         ThreadedJr Jr = new ThreadedJr(lg);
         Jr.start();
        }
    }
}
