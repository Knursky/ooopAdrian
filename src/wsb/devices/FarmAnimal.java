package wsb.devices;

import wsb.Animal;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }


    @Override
    public void beEaten() throws Exception {
        this.kill();
        System.out.println("that was yuammy");
    }
}
