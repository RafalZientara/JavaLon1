package pl.com.sda.rafal.zientara.javalon.week2.homework.farm;

import pl.com.sda.rafal.zientara.javalon.people.Employee;

public interface Converter<Input extends Entity, Output extends Employee> {

    Output map(Input input);

}
