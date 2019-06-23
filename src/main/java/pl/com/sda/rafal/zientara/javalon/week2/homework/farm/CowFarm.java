package pl.com.sda.rafal.zientara.javalon.week2.homework.farm;

import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.Cow;

public class CowFarm<C extends Cow> extends OldMcDonaldFarm<C> {

    @Override
    public C getAnimal(int i) {
        return super.getAnimal(i);
    }

    public void milking() {
        int milk = 0;

        for (C cow : animals) {
            cow.makeSound();
            milk += cow.getMilk();
        }

        System.out.printf("I have %d liters of milk\n\n\n", milk);
        String format = String.format("pattern %d %s", milk, "farma");

    }

}
