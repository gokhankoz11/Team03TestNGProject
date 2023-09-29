package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US15_TC05 extends LoginIn15GK {
    @Test
    public void testCase06() throws FileNotFoundException, InterruptedException {
        // Shipping islemleri  zorunlu alanlar dolduruldugunda  gerceklesir
        // ("Weight (kg)", "Dimensions (cm)", "Shipping class", "Processing Time")

        loginIn15();
        testShipping("10","10","10","10");

    }
}
