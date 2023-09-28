package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

public class US15_TC04 extends LoginInGK {
    @Test
    public void testCase04() {
        testShipping("10","10","10","10");

    }
}
