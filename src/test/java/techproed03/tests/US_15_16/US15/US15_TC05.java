package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

public class US15_TC05 extends LoginInGK {
    @Test
    public void testCase06() {
        // Shipping islemleri  zorunlu alanlar dolduruldugunda  gerceklesir
        // ("Weight (kg)", "Dimensions (cm)", "Shipping class", "Processing Time")
        testShipping("10","10","10","10");

    }
}
