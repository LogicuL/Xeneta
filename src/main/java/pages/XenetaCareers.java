package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import helpers.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class XenetaCareers
{
    private WebDriver driver;
    private NgWebDriver ngDriver;
    DriverUtils driverUtils = new DriverUtils();

    //Elements
    private By careersPageText = By.xpath("//*[@id=\"hs_cos_wrapper_module_158709745267770\"]/div/div/div/div/div/h2");
    private By departmentsList = By.xpath("//*[@id=\"hs_cos_wrapper_widget_1586018384297\"]/div/div/div/ul");
    private By values = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556886\"]/div/div/div/div[1]/h2");
    private By firstValue = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556886\"]/div/div/div/ul/li[1]");
    private By secondValue = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556886\"]/div/div/div/ul/li[2]");
    private By thirdValue = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556886\"]/div/div/div/ul/li[3]");
    private By fourthValue = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556886\"]/div/div/div/ul/li[4]");
    private By firstValueContent = By.id("Xenetaisone-1");
    private By secondValueContent = By.id("Modernizationthroughdata-2");
    private By thirdValueContent = By.id("VarietyandFairness-3");
    private By fourthValueContent = By.id("TransparencybuildsTrust-4");
    private By openRoles = By.xpath("//*[@id=\"hs_cos_wrapper_widget_27351556888\"]/div/div/div/div/div/div[1]/h2");


    public XenetaCareers(WebDriver driver, NgWebDriver ngDriver)
    {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }

    public boolean careersPageIsDisplayed()
    {
        driverUtils.scrollToElement(driver,driver.findElement(careersPageText));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String pageWelcomeText = driverUtils.getTextFromElement(driver,driver.findElement(careersPageText));
        System.out.println(pageWelcomeText);
        if(pageWelcomeText.contains("Help us build the future of freight procurement."))
            return true;
        else
            return false;
    }

    public List<String> getListOfDepartments()
    {
        driverUtils.scrollToElement(driver,driver.findElement(departmentsList));
        List<WebElement> selectedElements = driver.findElements(departmentsList);
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public boolean allDepartmentsAreDisplayed()
    {
        boolean flag = false;
        String[] departments = new String[]{"Technology", "Product", "Rate Management",
                "Marketing", "Customer Success", "Finance and People Ops", "Legal", "Sales"};

        for(int i=0;i<getListOfDepartments().size();i++)
        {
            for (String department : departments)
            {
                if (getListOfDepartments().get(i).contains(department))
                    flag = true;
            }
        }

        return flag;
    }

    public String getFirstValue()
    {
        driverUtils.scrollToElement(driver,driver.findElement(values));
        driver.findElement(firstValue).click();
        return driver.findElement(firstValueContent).getText();
    }

    public String getSecondValue()
    {
        driverUtils.scrollToElement(driver,driver.findElement(values));
        driver.findElement(secondValue).click();
        return driver.findElement(secondValueContent).getText();
    }

    public String getThirdValue()
    {
        driverUtils.scrollToElement(driver,driver.findElement(values));
        driver.findElement(thirdValue).click();
        return driver.findElement(thirdValueContent).getText();
    }

    public String getFourthValue()
    {
        driverUtils.scrollToElement(driver,driver.findElement(values));
        driver.findElement(fourthValue).click();
        return driver.findElement(fourthValueContent).getText();
    }

    public String getOpenPositions()
    {
        driverUtils.scrollToElement(driver,driver.findElement(openRoles));
        return driver.findElement(openRoles).getText();
    }


}
