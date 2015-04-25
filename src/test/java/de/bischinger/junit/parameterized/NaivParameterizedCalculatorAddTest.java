package de.bischinger.junit.parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NaivParameterizedCalculatorAddTest {

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { 1, 2, 3 }, { -1, -2, -3 }, { Integer.MAX_VALUE, Integer.MAX_VALUE, -2 },
            { Integer.valueOf(1), Integer.valueOf(2), 3 } });
    }

    private int x;
    private int y;
    private int expected;

    public NaivParameterizedCalculatorAddTest(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void should_pass() {
        assertThat(Calculator.add(x,y)).isEqualTo(expected);
    }
}