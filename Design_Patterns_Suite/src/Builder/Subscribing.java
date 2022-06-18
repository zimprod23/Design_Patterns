package Builder;
import java.util.*;

import Builder.OtherServices.*;

public class Subscribing {
    
    public List<Subscribe> subs = new ArrayList<Subscribe>();
    public ServiceBuilder serviceBuilder;
    public Float TotalCost = 0.0f;
    public Subscribing(HostingServiceTP subscribes,ServiceBuilder sb){
         serviceBuilder = sb;
         subs.add(subscribes.setIncludingServices(serviceBuilder));
         for(String Sname : serviceBuilder.ServicesNames)
            System.out.print(Sname);
    }

    // public void AddSub(HostingServiceTP e){
    //    this.subs.add(e.setIncludingServices(serviceBuilder));
    // }

    public Float GetTotalCost(){
        for(Subscribe s:subs){
            HostingServiceTP casted = (HostingServiceTP) s;
            TotalCost += casted.Price() + casted.OtherServicesPrice();
        }
        return TotalCost;
    }

    public void DescribeSub(){
       for(Subscribe s : this.subs){
        System.out.println("-------------------- "+s.HostingServiceName()+"---------------------\nIncluding services :");
          for(IncludingServices sb : s.Services()){
            System.out.println(sb.ServiceName());
          }
          System.out.println("Total price is : "+GetTotalCost()+" $");
       }
    }



}
