package techproed03.tests.US_15_16.US15;

import org.testng.annotations.Test;
import techproed03.tests.US_15_16.LoginInGK;

public class US15_TC02 extends LoginInGK {
    @Test
    public void testCase02() {
        testInventory("","");
      // Inventory islemleri  zorunlu alanlar doldurulmadan   gerceklesmemeli
        // ("SKU", "Manage Stock?", "Stock Status",  "SoldI ndividually")

    }
}
