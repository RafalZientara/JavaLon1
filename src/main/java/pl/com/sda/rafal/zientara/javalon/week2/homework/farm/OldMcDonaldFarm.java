package pl.com.sda.rafal.zientara.javalon.week2.homework.farm;

import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.Animal;
import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.BirdAnimal;
import pl.com.sda.rafal.zientara.javalon.week2.homework.farm.animals.MammalAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OldMcDonaldFarm<T extends Animal> {
    protected List<T> animals;

    public OldMcDonaldFarm() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T newAnimal) {
        animals.add(newAnimal);
    }

    public T getAnimal(int i) {
        return animals.get(i);
    }

    public void printAllInfo() {
        System.out.println("Wszystkie zwierzêta");
        for (Animal temp : animals) {
            temp.printInfo();
        }
        System.out.println();
    }

    public void printBirdsInfo() {
        System.out.println("Ptaki na farmie:");
        for (Animal temp : animals) {
            if (temp instanceof BirdAnimal)
                temp.printInfo();
        }
        System.out.println();
    }

    public void printBirdsInfoStream() {
        System.out.println("Ptaki na farmie:");

        List<T> tList = animals.stream()
//                .filter(n -> n.getClass()
//                        .getGenericSuperclass() == BirdAnimal.class)
                .filter(a -> a instanceof BirdAnimal)
                .collect(Collectors.toList());
        for (T ptaki : tList) {
            System.out.println(ptaki.getName());
        }

        System.out.println();
    }

    public void printMammalsInfo() {
        System.out.println("Ssaki na farmie:");
        List<T> collect = animals.stream()
                .filter(a -> a instanceof MammalAnimal)
                .collect(Collectors.toList());

        for (T temp : collect) {
            temp.printInfo();
        }
    }

}
