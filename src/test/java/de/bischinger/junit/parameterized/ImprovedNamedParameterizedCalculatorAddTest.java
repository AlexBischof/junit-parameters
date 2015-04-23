package de.bischinger.junit.parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ImprovedNamedParameterizedCalculatorAddTest {

    @Parameters(name = "{index}: Calculator.add({0},{1})={2}")
    //Notice the change von Iterable<Object[]> to Object[][]. Expected are Iterables and Objects
    public static Object[][] data() {
        return new Object[][] { { 1, 2, 3 }, { -1, -2, -3 }, { Integer.MAX_VALUE, Integer.MAX_VALUE, -2 },
            { Integer.valueOf(1), Integer.valueOf(2), 3 } };
    }

    @Parameter public int x;
    @Parameter(1) public int y;
    @Parameter(2) public int expected;

    @Test
    public void should_pass() {
        assertThat(Calculator.add(x, y)).isEqualTo(expected);
    }
}