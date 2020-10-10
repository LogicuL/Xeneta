package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import helpers.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class XenetaDemo
{

    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    //Elements
    private By demoPageText = By.xpath("//*[@id=\"hs_cos_wrapper_module_1599651837851372_\"]/h1[2]");
    private By scheduleNowButton = By.linkText("SCHEDULE ONLINE");
    private By watchNowButton = By.linkText("WATCH NOW");
    private By signUpButton = By.linkText("SIGN UP HERE");

    public XenetaDemo(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }

    /**
     * Check demo page is displayed

     */
    public boolean demoPageIsDisplayed()
    {
        String pageWelcomeText = driverUtils.getTextFromElement(driver,driver.findElement(demoPageText));
        System.out.println(pageWelcomeText);
        if(pageWelcomeText.contains("See Xeneta In Action"))
            return true;
        else
            return false;
    }

    /**
     * Check you can schedule a demo
     */
    public String scheduleOneOnOneDemo()
    {
        String pageUrl;
        driverUtils.waitForElementToBeDisplayed(driver,driver.findElement(scheduleNowButton));
        driverUtils.scrollToElement(driver,driver.findElement(scheduleNowButton));
        driver.findElement(scheduleNowButton).click();
        switchToSecondTab();
        pageUrl = driver.getCurrentUrl();
        switchBackToMainTabAfterClosingTheSecond();
        return pageUrl;
    }

    /**
     *  Check you can watch a demo
     */
    public String watchNow()
    {
        driverUtils.waitForElementToBeDisplayed(driver,driver.findElement(watchNowButton));
        driverUtils.scrollToElement(driver,driver.findElement(watchNowButton));
        driver.findElement(watchNowButton).click();
        return driver.getCurrentUrl();
    }

    /**
     * Check you can sign up
     */
    public String signUp()
    {
        String pageUrl;
        driverUtils.waitForElementToBeDisplayed(driver,driver.findElement(signUpButton));
        driverUtils.scrollToElement(driver,driver.findElement(signUpButton));
        driver.findElement(signUpButton).click();
        switchToSecondTab();
        pageUrl = driver.getCurrentUrl();
        switchBackToMainTabAfterClosingTheSecond();
        return pageUrl;
    }

    private void switchToSecondTab()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    private void switchBackToMainTabAfterClosingTheSecond()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



}
