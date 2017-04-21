package luhn;

public class LuhnTest {

    public static boolean passes(String digits) {
        String reversedDigits = new StringBuilder(digits).reverse().toString();

        int result = Integer.parseInt(reversedDigits.substring(0,1)) +
            addDigitComponents((Integer.parseInt(reversedDigits.substring(1, 2)) * 2)) +
            Integer.parseInt(reversedDigits.substring(2,3)) +
            addDigitComponents((Integer.parseInt(reversedDigits.substring(3,4)) * 2));

        return (result % 10) == 0;
    }

    private static int addDigitComponents(int digit){
        return (digit / 10) + (digit % 10);
    }
}
