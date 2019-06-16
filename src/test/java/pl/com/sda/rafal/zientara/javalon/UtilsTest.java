package pl.com.sda.rafal.zientara.javalon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    public void getSimpleStringLength() {
        // given
        String input = "Hello!";
        int expectedLength = 6;

        assertStringLength(input, expectedLength);
    }

    private void assertStringLength(String input, int expectedLength) {
        // when
        int length = Utils.getStringLength(input);

        // then
        assertEquals(expectedLength, length);
    }

    @Test
    public void getEmptyStringLength() {
        // given
        String input = "";
        int expectedLength = 0;

        // when
        assertStringLength(input, expectedLength);
    }

    @Test
    public void getNullStringLength() {
        // given
        String input = null;
        int expectedLength = 0;

        // when
        assertStringLength(input, expectedLength);
    }

    //todo 5 tests
    @Test
    public void getNumberOfDigitsWhenThereIsNoDigits() {
        //given
        String input = "236";
        int searchNumber = 5;
        int expectedCount = 0;
        assertLol(input, searchNumber, expectedCount);

    }

    private void assertLol(String input, int searchNumber, int expectedCount) {
        //when
        int count = Utils.getNumberCount(input, searchNumber);

        //then
        assertEquals(expectedCount, count);
    }

    @Test
    public void getNumberOfDigitsWhenThereIsNoDigitsInText() {
        //given
        String input = "38z682";
        int searchNumber = 5;
        int expectedCount = 0;

        //when
        assertLol(input, searchNumber, expectedCount);
    }

    @Test
    public void getNumberOfDigitsWhenAllAreMatching() {
        //given
        String input = "555";
        int searchNumber = 5;
        int expectedCount = 3;
        assertNumberCount(input, searchNumber, expectedCount);

    }

    private void assertNumberCount(String input, int searchNumber, int expectedCount) {
        //when
        assertLol(input, searchNumber, expectedCount);
    }

    @Test
    public void getNumberOfDigitsWhenFewAreMatchingWithLetters() {
        //given
        String input = "abc5d5";
        int searchNumber = 5;
        int expectedCount = 2;

        //when
        assertLol(input, searchNumber, expectedCount);
    }

    @Test
    public void getNumberOfDigitsWhenFewAreMatching() {
        //given
        String input = "345675";
        int searchNumber = 5;
        int expectedCount = 2;

        //when
        assertLol(input, searchNumber, expectedCount);
    }

    @Test
    public void getNumberOfDigitBiggerThan9WillThrow() {
        //given
        String input = "345675";
        int searchNumber = 10;

        //when then
        assertThrows(IllegalAccessError.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                //todo cos so ma eksplodowac
            }
        });
    }


}