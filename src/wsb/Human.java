package wsb;

import wsb.devices.Car;
import wsb.devices.FarmAnimal;
import wsb.devices.Phone;

public abstract class Human extends Animal{
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Double cash = 200.0;
    private Phone mobile;
    public Car car;

    public FarmAnimal[] farmAnimals;

    protected String phoneNumber;
    private Double salary;

    public Human() {

        super("homo sapiens");
    }

    public Double getSalary() {
        return salary;
    }

    public void sell() throws Exception {
        throw new Exception("don't do this freak");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this freak");
    }
    public String toString() {
        return this.firstName + " " + this.lastName + " im a human";
    };
public void feed(){
    System.out.println("im a human i will use for and knife");
    super.feed(DEFAULT_FEED_WEIGHT);
}

    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }
}

