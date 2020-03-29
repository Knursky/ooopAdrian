package wsb.devices;

import wsb.Human;

public abstract class DieselCar extends Car {
    public DieselCar(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model, yearOfProduction, sizeOfAnEngine);
    }

    @Override
    public boolean refuel() {
        return false;
    }

    public abstract void sell(Human buyer, Human seller) throws Exception;
}

