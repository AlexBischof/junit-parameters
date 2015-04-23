package de.bischinger.junit.parameterized;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by Alexander Bischof on 21.04.15.
 */
public class MyRule implements TestRule {

    private String str;

    public MyRule(String str) {
        this.str = str;
    }

    @Override public Statement apply(Statement base, Description description) {
        System.out.println(str);
        return base;
    }
}
