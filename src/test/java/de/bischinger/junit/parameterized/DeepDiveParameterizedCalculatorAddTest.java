package de.bischinger.junit.parameterized;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DeepDiveParameterizedCalculatorAddTest {

    @Parameters(name = "{index}: Calculator.add({0},{1})={2}")
    public static Object[][] data() {
        System.out.println("Hallo Parameters");
        return new Object[][] { { 1, 2, 3 }, { -1, -2, -3 } };
    }

    @Parameter public int x;
    @Parameter(1) public int y;
    @Parameter(2) public int expected;

    @Rule public MyRule rule = new MyRule("Method-Rule");

    @ClassRule public static MyRule classRule = new MyRule("Class-Rule");

    @BeforeClass public static void beforeClass()
    {
        System.out.println("beforeclass");
    }

    public DeepDiveParameterizedCalculatorAddTest() {
        System.out.println("constructor");
    }

    @Test
    public void should_pass()
    {
        System.out.println("Hallo Test");
        assertThat(Calculator.add(x, y)).isEqualTo(expected);
    }
}