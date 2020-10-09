package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import helpers.DriverUtils;
import org.openqa.selenium.WebDriver;

public class XenetaCareers
{
    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    public XenetaCareers(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }
}
