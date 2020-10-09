package base;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTests
{
    private WebDriver driver;
    private NgWebDriver ngWebDriver;

    @BeforeClass
    public void setup()
    {
        // set the property for the chrome driver and point to the location

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        ngWebDriver = new NgWebDriver(jsDriver);

    }
}
