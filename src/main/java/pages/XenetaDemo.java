package pages;

import helpers.DriverUtils;

public class XenetaDemo
{

    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    public XenetaDemo(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }
}
