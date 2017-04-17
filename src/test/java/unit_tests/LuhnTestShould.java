package unit_tests;

import org.junit.Test;
import luhn.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LuhnTestShould {

    @Test
    public void pass_for_digits_with_all_zeroes() {
        assertThat(LuhnTest.passes("000000000"), is(true));
    }

    @Test
    public void not_pass_for_invalid_digits() {
        assertThat(LuhnTest.passes("000000001"), is(false));
    }
}
