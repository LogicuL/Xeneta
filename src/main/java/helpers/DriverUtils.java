package helpers;

public class DriverUtils
{
    public void waitForElementToBeDisplayed(WebDriver driver, By elementToBeDisplayed)
    {
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1));

        //WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementToBeDisplayed)));

    }
}
