package wsb.devices;

import wsb.Human;


    public abstract class Car extends Device{
    public final Integer yearOfProduction;
    public final Double sizeOfAnEngine;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model);
        this.yearOfProduction = yearOfProduction;
        this.sizeOfAnEngine = sizeOfAnEngine;

    }

    @Override
    public void turnOn() {
        System.out.println("Check Engine ;-)");
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.plates;
    }
@Override
    public void sell(Human buyer, Human seller, Double price) throws Exception
        if (buyer.cash >= price) {
            buyer.car = this;
            buyer.cash -= price;
            seller.car = null;
            seller.cash = price;
            System.out.println(seller.firstName + " sell a car (" + this.model, + this.producer + this.plates")
    }else {
            throw new Exception ("you dont have enaught dolans to pay :(");
    }
}


