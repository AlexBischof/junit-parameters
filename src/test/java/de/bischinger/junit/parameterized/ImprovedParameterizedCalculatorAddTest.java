package de.bischinger.junit.parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.*;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ImprovedParameterizedCalculatorAddTest {

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { 1, 2, 3 }, { -1, -2, -3 }, { Integer.MAX_VALUE, Integer.MAX_VALUE, -2 },
            { Integer.valueOf(1), Integer.valueOf(2), 3 } });
    }

    @Parameter public int x;
    @Parameter(1) public int y;
    @Parameter(2) public int expected;


    @Test
    public void should_pass() {
        assertThat(Calculator.add(x,y)).isEqualTo(expected);
    }
}