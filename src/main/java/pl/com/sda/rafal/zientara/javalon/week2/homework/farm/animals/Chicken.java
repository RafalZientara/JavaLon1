package pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals;

public class Chicken extends BirdAnimal {

    public Chicken(String name) {
        super("feathers", name);
    }
    public Chicken(String skin, String name) {
        super(skin, name);
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    String getSound() {
        return "Chick Chick Chikeeeeeen";
    }
}