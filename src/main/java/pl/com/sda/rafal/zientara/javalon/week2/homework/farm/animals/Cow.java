package pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals;

import java.util.Random;

public class Cow extends MammalAnimal {

    public Cow(String name) {
        super("fur", name);
    }

    public Cow(String skin, String name) {
        super(skin, name);
    }

    public String getSound() {
        return "mu mu mu";
    }

    public int getMilk() {
        return new Random().nextInt(10);
    }

}
