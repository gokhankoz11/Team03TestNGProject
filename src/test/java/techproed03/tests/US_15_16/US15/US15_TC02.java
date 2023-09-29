package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US15_TC02 extends LoginIn15GK {
    @Test
    public void testCase02() throws FileNotFoundException, InterruptedException {
        // Inventory islemleri  zorunlu alanlar doldurulmadan   gerceklesmemeli
        // ("SKU", "Manage Stock?", "Stock Status",  "SoldI ndividually")
        loginIn15();
        testInventory("", "");


    }
}
