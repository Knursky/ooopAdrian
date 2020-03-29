package wsb;

import java.io.File;

public class Animal implements feedable {
    final String species;
    private Double weight;
    public String name;
    File pic;

    private static Double NEW_DOG_WEIGHT = 4.0;
    private static Double NEW_LION_WEIGHT = 39.2;
    private static Double NEW_OTHER_ANIMAL_WEIGHT = 5.3;
    private static Double DEFAULT_FEED_WEIGHT = 1.0;

    public Animal(String species) {
        System.out.println("we created new Animal");
        this.species = species;

        switch (species) {
            case "dog": {
                weight = NEW_DOG_WEIGHT;
                break;
            }
            case "lion": {
                weight = NEW_LION_WEIGHT;
                break;
            }
            default: {
                weight = NEW_OTHER_ANIMAL_WEIGHT;
                break;
            }
        }
    }

    public void feed() {
        feed(DEFAULT_FEED_WEIGHT);

    }
private double DEFAULT_FEED_WEIGHT = 1.0;

    public void feed() {
        if (weight == 0) {
            System.out.println("too late, " + name + " is dead");
        } else {
            ++weight;
            System.out.println(name + " says thx for food");
        }
    }


    void takeForAWalk() {
        if(weight == 0.0){
            System.out.println("you can't walk the street with dead animal you freak");
        } else if (weight > 3.0) {
            --weight;
            System.out.println(name + " says thx for a walk");
        } else if (weight > 1.0) {
            --weight;
            System.out.println(name + " says thx for a walk but I'm hungry");
        } else {
            weight = 0.0;
            System.out.println(name + " died");
        }
    }

    Double getWeight() {
        return weight;
    }


    @Override
    public void sell() throws Exception {
        System.out.println("now gimme the money");
    }

    @Override
    public void eat() throws Exception {
        System.out.println("that was yuammy");
    }
}


        }