package luhn;

public class LuhnTest {

    public static boolean passes(String digits) {
        String reversedDigits = new StringBuilder(digits).reverse().toString();
        String firsDigit = reversedDigits.substring(0,1);
        String secondDigit = reversedDigits.substring(1, 2);

        int result = Integer.parseInt(firsDigit) + addDigitComponents((Integer.parseInt(secondDigit) * 2));

        return (result % 10) == 0;
    }

    private static int addDigitComponents(int digit){
        return (digit / 10) + (digit % 10);
    }
}
