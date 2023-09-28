package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

public class US15_TC06 extends LoginInGK {
    @Test
    public void testCase07() {

        //Shipping islemleri  zorunlu alanlar gecersiz veriler ile dolduruldugunda gerceklesmemeli
        // ("Weight (kg)", "Dimensions (cm)", "Shipping class", "Processing Time")

        testShipping("","","","");
    }
}
