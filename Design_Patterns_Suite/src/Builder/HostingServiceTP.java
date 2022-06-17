package Builder;

import java.util.*;

import Builder.OtherServices.IncludingServices;
import Builder.OtherServices.ServiceBuilder;

public abstract class HostingServiceTP implements Subscribe{
     
    public List<IncludingServices> services;
    public ServiceBuilder sb;
    @Override
    public abstract Float Price();

    @Override
    public abstract String HostingServiceName();

    @Override
    public List<IncludingServices> Services() {
        return services;
    }

    public Float OtherServicesPrice(){
       if(sb != null){
           return sb.getTotal();
       }else{
        return null;
       }
    }

    public HostingServiceTP setIncludingServices(ServiceBuilder sbb){
        this.sb = sbb;
       services = sb.getServices();
       return this;
    }
    
}
