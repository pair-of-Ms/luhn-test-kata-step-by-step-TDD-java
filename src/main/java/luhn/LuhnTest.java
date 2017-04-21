package luhn;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LuhnTest {

    public static boolean passes(String digits) {
        List<Integer> reversed = reverse(digits).stream().
            map(i -> Integer.parseInt(i)).
            collect(Collectors.toList());

        int result = sum(digitsAtPositionsFulfilling(isEven, reversed)) +
            sum(digitsAtPositionsFulfilling(isEven.negate(), reversed).map(i -> addDigitComponents(2 * i)));

        return (result % 10) == 0;
    }

    private static Integer sum(Stream<Integer> digits) {
        return digits.reduce(0, (a, b) -> a + b);
    }

    private static List<String> reverse(String digits) {
        return Arrays.asList(new StringBuilder(digits).reverse().toString().split(""));
    }

    private static IntPredicate isEven = (x) -> x % 2 == 0;

    private static Stream<Integer> digitsAtPositionsFulfilling(IntPredicate f, List<Integer> reversed) {
        return IntStream.range(0, reversed.size()).
            filter(f).
            mapToObj(reversed::get);
    }

    private static int addDigitComponents(int digit) {
        return (digit / 10) + (digit % 10);
    }
}
