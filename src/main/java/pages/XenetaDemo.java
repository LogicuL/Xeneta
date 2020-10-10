package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import helpers.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XenetaDemo
{

    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    //Elements
    private By demoPageText = By.xpath("//*[@id=\"hs_cos_wrapper_module_1599651837851372_\"]/h1[2]");

    public XenetaDemo(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }

    public boolean demoPageIsDisplayed()
    {
        String pageWelcomeText = driverUtils.getTextFromElement(driver,driver.findElement(demoPageText));
        System.out.println(pageWelcomeText);
        if(pageWelcomeText.contains("See Xeneta In Action"))
            return true;
        else
            return false;
    }

}
