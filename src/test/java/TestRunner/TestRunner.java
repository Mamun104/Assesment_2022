package TestRunner;

import Pages.HomePage;
import SetupPage.Setup;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    HomePage homePage;

    @Test
    public void testSelectDepartment() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        homePage.selectDepartment();

    }

    @Test
    public void testSearchProduct() throws InterruptedException {
        driver.get("https://www.amazon.com");
        homePage.searchProduct();

    }


}
