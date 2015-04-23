package de.bischinger.junit.parameterized;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NaivIsolatedCalculatorAddTest {

    @Test
    public void should_pass_with_positives() {

        int x = 1;
        int y = 2;
        assertThat(Calculator.add(x, y)).isEqualTo(3);
    }

    @Test
    public void should_pass_with_negatives() {
        int x = -1;
        int y = -2;
        assertThat(Calculator.add(x, y)).isEqualTo(-3);
    }

    @Test
    public void should_pass_with_integer_maxvalue() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        assertThat(Calculator.add(x, y)).isEqualTo(-2);
    }

    @Test
    public void should_pass_with_Boxed_integers() {
        int x = Integer.valueOf(1);
        int y = Integer.valueOf(2);
        assertThat(Calculator.add(x, y)).isEqualTo(3);
    }
}