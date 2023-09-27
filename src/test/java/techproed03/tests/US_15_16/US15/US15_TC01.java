package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

import java.io.FileNotFoundException;

public  class US15_TC01 extends LoginInGK {

    @Test
    public void testCase01() {
    testInventory("A10", "10");


    }
}
