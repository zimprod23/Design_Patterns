package Builder;
import Builder.OtherServices.IncludingServices;
import java.util.*;


public interface Subscribe {
    public Float Price();
    public String HostingServiceName();
    public List<IncludingServices> Services();
}
