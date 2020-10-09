package pages;

import helpers.DriverUtils;

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
}
