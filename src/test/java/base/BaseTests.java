package base;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.XenetaHomepage;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

public class BaseTests
{
    private WebDriver driver;
    private NgWebDriver ngWebDriver;
    protected XenetaHomepage homepage;

    @BeforeClass
    public void setup()
    {
        // set the property for the chrome driver and point to the location

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        // defined the NgWebDriver for having more angular related actions available
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        ngWebDriver = new NgWebDriver(jsDriver);

    }

    @BeforeMethod
    public void methodSetup()
    {
        driver.get("https://www.xeneta.com/");
        driver.manage().window().maximize();
        ngWebDriver.waitForAngularRequestsToFinish();
        homepage = new XenetaHomepage(driver,ngWebDriver);
        ngWebDriver.waitForAngularRequestsToFinish();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    /**
     * Everythime a test fails, there is a screenshot with the failure added to the resources/screenshot directory in this project
     * @param result
     */
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                  Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
