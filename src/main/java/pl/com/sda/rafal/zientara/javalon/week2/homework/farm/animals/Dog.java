package pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals;

public class Dog extends MammalAnimal {

    public Dog() {
        this("fur", "Fafik");
    }

    public Dog(String name) {
        super("fur", name);
    }

    public Dog(String skin, String name) {
        super(skin, name);
    }

    @Override
    String getSound() {
        return "Woof Woof";
    }
}