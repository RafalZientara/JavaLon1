package pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals;

public abstract class BirdAnimal extends Animal {

    public BirdAnimal(String skin, String name) {
        super(skin, name);
    }

    public void fly() {
        if (canFly()) {
            System.out.println("Latam");
        } else {
            System.out.println("Ptak nielot");
        }
    }

    public abstract boolean canFly();

}
