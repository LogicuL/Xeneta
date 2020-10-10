package careers;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.XenetaCareers;

public class XenetaCareersTests extends BaseTests
{
    @Test
    public void check_CareersPageIsDisplayed()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.careersPageIsDisplayed(),"The Careers page was not loaded");
    }

    @Test
    public void check_AllDepartmentsAreDisplayedCorrectly()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.allDepartmentsAreDisplayed(),"Not all the departments are displayed on Careers page");
    }

    @Test
    public void check_FirstValueIsDisplayedCorrectly()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.getFirstValue().contains("Xeneta is one"),"First value is not displayed correctly");
    }

    @Test
    public void check_SecondValueIsDisplayedCorrectly()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.getSecondValue().contains("Modernization through data"),"Second value is not displayed correctly");
    }

    @Test
    public void check_ThirdValueIsDisplayedCorrectly()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.getThirdValue().contains("Variety and Fairness"),"Third value is not displayed correctly");
    }

    @Test
    public void check_FourthValueIsDisplayedCorrectly()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertTrue(xenetaCareersPage.getFourthValue().contains("Transparency builds Trust"),"Fourth value is not displayed correctly");
    }

    @Test
    public void check_OpenPositionsSectionExists()
    {
        XenetaCareers xenetaCareersPage = homepage.navigateToCareersPage();
        Assert.assertEquals(xenetaCareersPage.getOpenPositions(),"Open roles","<<Open roles>> section is not displayed on the Careers page");
    }
}
