package de.bischinger.junit.parameterized;

import org.junit.Test;

import static de.bischinger.junit.parameterized.Calculator.add;
import static org.assertj.core.api.Assertions.assertThat;

public class NaivBadCalculatorAddTest {

    @Test
    public void should_pass() {

        int x = 1;
        int y = 2;
        assertThat(add(x, y)).isEqualTo(3);

        x = -1;
        y = -2;
        assertThat(add(x, y)).isEqualTo(-3);

        x = Integer.MAX_VALUE;
        y = Integer.MAX_VALUE;
        assertThat(add(x, y)).isEqualTo(-2);

        Integer boxedX = Integer.valueOf(1);
        Integer boxedY = Integer.valueOf(2);
        assertThat(add(boxedX, boxedY)).isEqualTo(3);
    }
}