package Builder;

import Builder.Hosting.Perso;
import Builder.OtherServices.MySQL;
import Builder.OtherServices.ServiceBuilder;
import Builder.OtherServices.Support24;

public class SubscribeBuilder {
    public static void main(String[] args) {
        Subscribing sbn = new Subscribing(new Perso(),new ServiceBuilder(new MySQL(),new Support24()));
        sbn.DescribeSub();
    }
}
