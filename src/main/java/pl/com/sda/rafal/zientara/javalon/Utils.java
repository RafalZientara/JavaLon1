package pl.com.sda.rafal.zientara.javalon;

public class Utils {
    public static int getStringLength(String input) {
        if (input == null) {
            return 0;
        }
        return input.length();
    }

    public static int getNumberCount(String input, int searchNumber) {
        if (searchNumber > 9 || searchNumber < 0) {
            throw new NumberNotSupported();
        }
        int count = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - 48 == searchNumber) {
                count++;
            }
        }
        return count;
//        input.charAt(index)
    }

}
