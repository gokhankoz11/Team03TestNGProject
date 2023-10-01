package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US15_TC04 extends LoginIn15GK {
    @Test
    public void testCase04() throws FileNotFoundException, InterruptedException {

       // Shipping islemleri zorunlu alanlar doldurulmadan gerceklesmemeli
        // ("Weight (kg)", "Dimensions (cm)", "Shipping class", "Processing Time")

        loginIn15();
        testShipping("","","","");




    }
}
