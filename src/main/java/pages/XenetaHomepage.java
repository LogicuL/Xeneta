package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import helpers.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XenetaHomepage
{
    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    public XenetaHomepage(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }

    public XenetaDemo navigateToDemoPage()
    {
       driver.get("https://www.xeneta.com/demo");
       return new XenetaDemo(driver,ngDriver);
    }

    public XenetaCareers navigateToCareersPage()
    {
        driver.get("https://www.xeneta.com/careers");
        return new XenetaCareers(driver,ngDriver);
    }
}
