package unit_tests;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LuhnTestShould {

    @Test
    public void fail() {
        assertThat(true, is(false));
    }
}
