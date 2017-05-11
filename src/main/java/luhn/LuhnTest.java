package luhn;

import java.util.Arrays;
import java.util.List;

public class LuhnTest {

    public static boolean passes(String digits) {
        String reversedDigits = new StringBuilder(digits).reverse().toString();
        List<String> reversedDigitsList = Arrays.asList(reversedDigits.split(""));

        int result = 0;

        for (int i = 0; i < reversedDigitsList.size(); i++) {
            if (i % 2 == 0) {
                result += Integer.parseInt(reversedDigitsList.get(i));
            } else {
                result += addDigitComponents(Integer.parseInt(reversedDigitsList.get(i)) * 2);
            }
        }

        return (result % 10) == 0;
    }

    private static int addDigitComponents(int digit){
        return (digit / 10) + (digit % 10);
    }
}
