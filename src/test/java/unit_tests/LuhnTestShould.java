package unit_tests;

import org.junit.Test;
import luhn.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LuhnTestShould {

    @Test
    public void pass_for_digits_with_all_zeroes() {
        assertThat(LuhnTest.passes("00000000000"), is(true));
    }

    @Test
    public void not_pass_for_inputs_with_invalid_digits() {
        assertThat(LuhnTest.passes("00000000001"), is(false));
    }

    @Test
    public void pass_for_inputs_with_all_zeroes_but_two_valid_digits_in_the_last_positions() {
        assertThat(LuhnTest.passes("00000000018"), is(true));
        assertThat(LuhnTest.passes("00000000026"), is(true));
        assertThat(LuhnTest.passes("00000000091"), is(true));
        assertThat(LuhnTest.passes("00000000083"), is(true));
    }
}
