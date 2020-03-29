package wsb.devices;

public abstract class ElectricCar extends Car {
    public ElectricCar(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model, yearOfProduction, sizeOfAnEngine);
    }

    @Override
    public boolean refuel() {
        return false;
    }
}
