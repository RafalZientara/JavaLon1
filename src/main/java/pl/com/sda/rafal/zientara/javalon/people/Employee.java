package pl.com.sda.rafal.zientara.javalon.people;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String surname;
    private String name;
    private int age;
    private double salary;
}
