package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

public class US15_TC05 extends LoginInGK {
    @Test
    public void testCase05() {
        testShipping("5","2","3","5");
    }
}
