package wsb;

import wsb.devices.Car;
import wsb.devices.Device;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Phone iphone = new Phone("Apple", "6s", 4.7);

        Human me = new Human();
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = iphone;

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("mini", "cooper", 2019, 1.6);
        dirtyOne.plates = "Sro Go";
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        iphone.turnOn();
        dirtyOne.turnOn();

        iphone.sell();
        me.pet.sell();


        Human knurzyca = new Human();
        knurzyca.firstName = "Knuroslawa";
        knurzyca.lastName = "Knurska";
        knurzyca.car = dirtyOne;

        System.out.println(me.car);
        system.out.println(me);

        Human brotherInLaw = new Human();
        brotherInLaw.firstName = "Wymyslony";
        brotherInLaw.lastName = "Szwagier";



        System.out.println(m0,e.car);
        System.out.println(dog);

        Device d = new Phone("Samsung","S10")
    }
}
