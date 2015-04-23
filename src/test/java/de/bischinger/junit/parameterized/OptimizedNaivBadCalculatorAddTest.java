package de.bischinger.junit.parameterized;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OptimizedNaivBadCalculatorAddTest {

    @Test
    public void should_pass() {

        int[][] parameters = new int[][] { { 1, 2, 3 }, { -1, -2, -3 }, { Integer.MAX_VALUE, Integer.MAX_VALUE, -2 },
            { Integer.valueOf(1), Integer.valueOf(2), 3 } };

        for (int[] parameter : parameters) {
            assertThat(Calculator.add(parameter[0], parameter[1])).isEqualTo(parameter[2]);
        }
    }
}