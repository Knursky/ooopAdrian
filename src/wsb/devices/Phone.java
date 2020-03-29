package wsb.devices;

import wsb.Human;

public class Phone extends Device {
    Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer,model);
        this.screenSize = screenSize;
    }

    public Phone(Object samsung, String s10) {
        super(samsung, s10);
    }

    @Override
    public void turnOn() {
        System.out.println("phone is turned on");
    }

    public void sell() { System.out.println("already sold");}

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }

    public void instalAnnApp(String name) {
        System.out.println("The app " + name + "was installed in the newest version");
    }
    public void instalAnnApp(String name, Double version){
        System.out.println("The app" + name+ " was installed in version " + version);
    }

    @Override
    public void sell(Human buyer, Human seller) throws Exception {

    }
}
