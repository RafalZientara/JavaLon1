package pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals;

public class Sparrow extends BirdAnimal {

    public Sparrow() {
        super("feathers", "Jack");
    }

    public Sparrow(String name) {
        super("feathers", name);
    }

    public Sparrow(String skin, String name) {
        super(skin, name);
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public String getSound() {
        return "cwir cwir";
    }
}
