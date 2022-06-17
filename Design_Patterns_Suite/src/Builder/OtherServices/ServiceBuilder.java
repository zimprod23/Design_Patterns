package Builder.OtherServices;
import java.util.*;;

public class ServiceBuilder {
     private List<IncludingServices> including = new ArrayList<IncludingServices>();
     public static Float TotalPrice=0.0f;
     public static String[] ServicesNames;
     public ServiceBuilder(IncludingServices... services){
            for(IncludingServices inc : services){
                this.including.add(inc);
            }
            ServicesNames = new String[this.including.size()];
     }

     public List<IncludingServices> getServices(){
        return this.including;
     }

     public Float getTotal(){
        for(IncludingServices inc : including){
            TotalPrice += inc.ServicePrice();
        }
        return TotalPrice;
     }
     public String[] getNames(){
        for(int i = 0;i<this.including.size();i++){
            ServicesNames[i] = this.including.get(i).ServiceName();
        }
        return ServicesNames;
     } 
}
