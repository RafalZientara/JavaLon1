package pl.com.sda.rafal.zientara.javalon.zoo;

import java.util.ArrayList;

public class OneSpeciesZoo<T extends AbstractAnimal> {
    private ArrayList<T> t;

    public OneSpeciesZoo() {
        t = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        t.add(animal);
    }

    public T get(int i) {
        return t.get(i);
    }

    public void seeAnimalInTheZoo() {
        for (T temp : t) {
            temp.eat();
            temp.makeSound();
        }
    }
}
