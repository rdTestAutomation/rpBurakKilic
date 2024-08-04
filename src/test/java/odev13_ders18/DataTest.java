package odev13_ders18;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
    @DataProvider(name = "gunDegerleri")
    public Object[][] gunDegerleri() {
        return new Object[][] {
                { 20, 5000 },  // 20 gün çalışma, beklenen maaş = 20 * 250
                { 30, 7500 },  // 30 gün çalışma, beklenen maaş = 30 * 250
                { 10, 2500 }   // 10 gün çalışma, beklenen maaş = 10 * 250
        };
    }

    @Test(dataProvider = "gunDegerleri")
    public void testCalculateMaas(int gun, int beklenenMaas) {
        DataTest dataTest = new DataTest();
        dataTest.setGun(gun);
        dataTest.calculateMaas();
        Assert.assertEquals(dataTest.getMaas(), beklenenMaas);
    }
}