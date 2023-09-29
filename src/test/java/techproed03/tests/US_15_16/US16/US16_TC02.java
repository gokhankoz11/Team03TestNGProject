package techproed03.tests.US_15_16.US16;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US16_TC02 extends LoginIn16GK {


    @Test
    public void testCase02() throws FileNotFoundException, InterruptedException {
        loginIn16("as","100","90");
        fotoEklemeSubmitGK();
    }
}
