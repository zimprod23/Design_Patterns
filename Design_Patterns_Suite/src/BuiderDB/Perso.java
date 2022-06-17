package BuiderDB;

public class Perso extends HostingService{

    @Override
    public String HostingServiceType() {
        return "Personal version";
    }

    @Override
    public Float Price() {
        return 30.0f;
    }
}
