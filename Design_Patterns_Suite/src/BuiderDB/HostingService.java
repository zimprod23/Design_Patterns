package BuiderDB;

public abstract class HostingService implements Subscribe{
    @Override
    public abstract String HostingServiceType();
    @Override
    public abstract Float Price();
    
    @Override
    public String[] OtherServices() {
        // TODO Auto-generated method stub
        return null;
    }
}
