package wsb.devices;

import wsb.Human;
import wsb.Soldable;

public abstract class Device implements Soldable {
        public String producer;
        public String model;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Device(Object samsung, String s10) {
    }

    public abstract void turnOn();

    public String getModel(){
        return this.model;
    }

    public void sell(){
        System.out.println("already sold");
    }

    public abstract void sell(Human buyer, Human seller, Double price) throws Exception;
}
