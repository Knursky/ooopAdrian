package wsb.devices;

public abstract class DieselCar extends Car {
    public DieselCar(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model, yearOfProduction, sizeOfAnEngine);
    }

    @Override
    public boolean refuel() {
        return false;
}
