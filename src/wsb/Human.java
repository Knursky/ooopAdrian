package wsb;

import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal{
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone mobile;
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
    }

}
public void feed(){
    System.out.println("im a human i will use for and knife");
    super.feed();
}
