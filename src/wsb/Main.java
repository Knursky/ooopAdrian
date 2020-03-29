package wsb;

import wsb.devices.Car;
import wsb.devices.Device;
import wsb.devices.DieselCar;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog") {
            @Override
            public void beEaten() throws Exception {

            }

            @Override
            protected void kill() {

            }
        };
        dog.name = "Szynek";

        Phone iphone = new Phone("Apple", "6s", 4.7);

        Human me = new Human() {
            @Override
            public void beEaten() throws Exception {
                
            }

            @Override
            protected void kill() {

            }
        };
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.setMobile(iphone);

      //  me.pet.feed();
        me.pet.takeForAWalk();
       // me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new DieselCar("mini", "cooper", 2019, 1.6) {
            @Override
            public void sell(Human buyer, Human seller) throws Exception {

            }
        };
        dirtyOne.plates = "Sro Go";
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        iphone.turnOn();
        dirtyOne.turnOn();

        iphone.sell();
        me.pet.sell();


        Human knurzyca = new Human();
        knurzyca.firstName = "Knuroslawa";
        knurzyca.lastName = "Knurska";
        knurzyca.car = dirtyOne;

        System.out.println(me.car);
        System.out.println(me);

        Human brotherInLaw = new Human();
        brotherInLaw.firstName = "Wymyslony";
        brotherInLaw.lastName = "Szwagier";



        System.out.println(dog);

        Device d = new Phone("Samsung","S10");
    }
}
