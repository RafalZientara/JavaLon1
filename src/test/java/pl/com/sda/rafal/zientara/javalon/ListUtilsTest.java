package pl.com.sda.rafal.zientara.javalon;

import org.junit.jupiter.api.Test;
import pl.com.sda.rafal.zientara.javalon.people.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ListUtilsTest {

    @Test
    public void zad0() {
        //given
        List<Integer> source = Arrays.asList(5, 72, 8, 11, 9);

        //when
        List<Integer> numbers = source.stream()
                .filter(n -> n < 10)
                .map(n -> n * n)
                .collect(Collectors.toList());

        //then
        assertThat(numbers).isEqualTo(Arrays.asList(25, 64, 81));
    }

    @Test
    public void zad1() {
        //given
        List<Integer> source = Arrays.asList(1, 3, 4, 10, 9, 13, 6);

        //when
        List<Integer> numbers = source.stream()
                .filter(n -> n %2 == 1)
                .map(n -> n * 100)
                .collect(Collectors.toList());

        //then
        assertThat(numbers).isEqualTo(Arrays.asList(100, 300, 900, 1300));
    }

    @Test
    public void zad2() {
        //given
        List<String> txt = Arrays.asList("ala", "samochód", "kot", "aleksandra", "pies", "azor");
        //when
        List<String> collect = txt.stream()
//                .filter(t -> t.toLowerCase().startsWith("a"))
                .filter(t -> t.startsWith("a") || t.startsWith("A"))
                .map(this::startWithCapital)
                .collect(Collectors.toList());
        for (String i : collect) {
            System.out.println(i);
        }

        //then
        assertThat(collect).isEqualTo(Arrays.asList("Ala", "Aleksandra", "Azor"));
    }

    @Test
    public void zad3() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("Kowal", "Jan", 34, 3400.0),
                new Employee("As", "Ala", 27, 4100.0),
                new Employee("As", "Ala", 27, 4100.0),
                new Employee("Kot", "Zofia", 33, 3700.0),
                new Employee("Puchacz", "Jan", 41 , 3600.0)
        );
        //when
        List<String> collect = employees.stream()
                .filter(e -> e.getAge() > 30 && e.getSalary() <4000)
                .map(e -> e.getName() + " " + e.getSurname())
                .collect(Collectors.toList());
        for (String i : collect) {
            System.out.println(i);
        }
        //then
        assertEquals(3, collect.size());
        assertThat(collect).isEqualTo(Arrays.asList("Jan Kowal", "Zofia Kot", "Jan Puchacz"));
    }

    private String startWithCapital(String text) {
        //inna droga na to samo
        char firstChar = Character.toUpperCase(text.charAt(0));

        String firstLetter = text.substring(0, 1).toUpperCase();
        String substring = text.substring(1);
        return firstLetter + substring;
    }

    @Test
    public void sumEvenElements() {
        //given
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(15);
        values.add(3);

        Integer sum = values
                .stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 5 == 0;
                    }
                })
//                .map(integer -> (double) integer)
//                .map(this::convertIfEven)
//                .map(integer -> convertIfEven(integer) )

//                .collect(Collectors.toList());
                .reduce(0, (acc, n) -> acc + n);

        System.out.println(sum);
    }

    private Integer convertIfEven(Integer integer) {
        if (integer % 2 == 0) {
            return integer;
        }
        return integer + 1;
    }

    private Integer convertIfEven(Integer integer, Integer second) {
        if (integer % 2 == 0) {
            return integer;
        }
        return integer + second;
    }

}