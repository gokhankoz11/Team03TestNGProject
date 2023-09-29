package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class US15_TC03 extends LoginIn15GK {
    @Test
    public void testCase03() throws FileNotFoundException, InterruptedException {

        // Inventory islemleri gecersiz datalar ile gerceklesmemeli
        // ("SKU", "Manage Stock?", "Stock Status",   "SoldI ndividually")
        loginIn15();
        testInventory("+-","+-");


    }
}
