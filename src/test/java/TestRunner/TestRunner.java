package TestRunner;

import Pages.HomePage;
import SetupPage.Setup;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    HomePage homePage;

    @Test(priority = 0, description = "select by index")
    public void testSelectByIndex() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        homePage.selectDepartmentByIndex();

    }
    @Test(priority = 1, description = "select by value")
    public void testSelectByValue() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        homePage.selectDepartmentByValue();
    }
    @Test(priority = 2, description = "select by visible text")
    public void testSelectByVisibleText() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        homePage.selectDepartmentByVisibleText();
    }
    @Test(priority = 3, description = "Search product test ")
    public void testSearchProduct() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        homePage.searchProduct();

    }


}
