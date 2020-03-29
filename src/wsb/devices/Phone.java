package wsb.devices;

public class Phone extends Device {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer,model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("phone is turned on");
    }

    public void sell() { System.out.println("already sold");}
    public void instalAnnApp(String name) {
        System.out.println("The app " + name + "was installed in the newest version");
    }
    public void instalAnnApp(String name, Double version){
        System.out.println("The app" + name+ " was installed in version " + version);
    }
}
