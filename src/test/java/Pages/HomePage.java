package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    @FindBy(id= "searchDropdownBox")
    WebElement selectDepartment;
    @FindBy(id= "twotabsearchtextbox")
    WebElement searchProduct;

    public WebDriver driver;
    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectDepartmentByIndex() throws InterruptedException {

        Thread.sleep(3000);
        Select department  = new Select(selectDepartment);
        department.selectByIndex(3);
        Thread.sleep(3000);

    }
    public void selectDepartmentByValue() throws InterruptedException {

        Thread.sleep(3000);
        Select department  = new Select(selectDepartment);
        department.selectByValue("search-alias=baby-products-intl-ship");
        Thread.sleep(3000);
    }
    public void selectDepartmentByVisibleText() throws InterruptedException {

        Thread.sleep(3000);
        Select department  = new Select(selectDepartment);
        department.selectByVisibleText("Baby");
        Thread.sleep(3000);
    }
    public void searchProduct() throws InterruptedException {
        Thread.sleep(3000);
        searchProduct.sendKeys("bag");
        searchProduct.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }

}
