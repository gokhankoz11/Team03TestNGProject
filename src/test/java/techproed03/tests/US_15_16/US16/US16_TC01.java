package techproed03.tests.US_15_16.US16;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.US15.LoginIn15GK;
import techproed03.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class US16_TC01 extends LoginIn16GK {

    @Test
    public void testCase01() throws FileNotFoundException, InterruptedException {

        // Simple Products islemleri zorunlu alanlar dolduruldugunda  gerceklesmeli

        loginIn16("Samsung","100","90");
        fotoEklemeSubmitGK();
        productteUrunGorme("Samsung");



    }
}
