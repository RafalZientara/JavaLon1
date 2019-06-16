package pl.com.sda.rafal.zientara.javalon;

public class Utils {
    public static int getStringLength(String input) {
        if (input == null) {
            return 0;
        }
        return input.length();
    }

    public static int getNumberCount(String input, int searchNumber) {

        for (int i = 33; i < 100; i++) {
            System.out.println(i + " = " + (char) i);
        }

        int count = 0;
        char[] chars = input.toCharArray();
//        for (char c : chars) {
//
//        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] -48 == searchNumber) {
                count++;
            }
        }
        return count;
//        input.charAt(index)
    }

    //todo Utils.getNumberCount(String text, int value)

}
