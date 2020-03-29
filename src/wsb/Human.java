package wsb;

import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal{
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    public Animal pet;
    private Phone mobile;
    public Car car;

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

