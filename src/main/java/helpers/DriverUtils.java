package helpers;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DriverUtils
{

    public void waitForElementToBeDisplayed(WebDriver driver, WebElement elementToBeDisplayed)
    {
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1));

        wait.until(ExpectedConditions.visibilityOf((elementToBeDisplayed)));
    }

    public void scrollToElement(WebDriver driver, WebElement elementToScroll)
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
    }

    public String getTextFromElement(WebDriver driver, WebElement element)
    {
        waitForElementToBeDisplayed(driver,element);
        return element.getText();
    }
}
