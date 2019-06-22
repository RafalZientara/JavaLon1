package pl.com.sda.rafal.zientara.javalon.week2.homework.farm;

import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.Cow;
import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.Sparrow;

public class MainCowFarm {

    public static void main(String[] args) {
        CowFarm cowFarm = new CowFarm();
        cowFarm.addAnimal(new Cow("Milka"));
        cowFarm.addAnimal(new Cow("Wilka"));
//        cowFarm.addAnimal(new Sparrow("Wilka"));


        cowFarm.printAllInfo();
        cowFarm.milking();
    }
}
