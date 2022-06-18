package Builder;
import Builder.Hosting.*;
import Builder.OtherServices.*;

public class SubscribeBuilder {
    public static void main(String[] args) {
        Subscribing sbn = new Subscribing(new Perso(),new ServiceBuilder(new MySQL(),new Support24()));
        Subscribing sbn2 = new Subscribing(new Perso(),new ServiceBuilder(new MySQL()));
       // sbn.AddSub(new Premuim());
        sbn.DescribeSub();
        sbn2.DescribeSub();
    }
}
