package pl.com.sda.rafal.zientara.javalon.week2.homework.farm;


import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.*;

public class MainFarm {

    public static void main(String[] args) {
        OldMcDonaldFarm<Animal> donaldFarm = new OldMcDonaldFarm<>();
        donaldFarm.addAnimal(new Cow("Milka"));
        donaldFarm.addAnimal(new Dog());
        donaldFarm.addAnimal(new Chicken("KFC"));
        donaldFarm.addAnimal(new Sparrow());

        donaldFarm.printAllInfo();
        donaldFarm.printBirdsInfo();
        donaldFarm.printMammalsInfo();
    }
}
