package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US15_TC08 extends LoginIn15GK {


    @Test
    public void testCase09() throws FileNotFoundException, InterruptedException {
        // Attributes islemleri  zorunlu alanlar doldurulmadan   gerceklesmeli   ("Color", "Size")

        loginIn15();
        testAttributes("");
    }
}
