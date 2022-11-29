package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


    public WebDriver driver;


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDepartment() throws InterruptedException {

        Thread.sleep(6000);
        Select department  = new Select(driver.findElement(By.id("searchDropdownBox")));
        department.selectByIndex(3);

    }
    public void searchProduct() throws InterruptedException {

        Thread.sleep(7000);
        WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
        searchItem.sendKeys("bag");
    }


}
