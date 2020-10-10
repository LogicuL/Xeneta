package demo;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.XenetaDemo;

public class XenetaDemoTests extends BaseTests
{

    @Test(priority = 0)
    public void check_DemoPageIsDisplayed()
    {
        XenetaDemo xenetaDemoPage = homepage.navigateToDemoPage();
        Assert.assertTrue(xenetaDemoPage.demoPageIsDisplayed(),"The Demo page was not loaded");
    }

    @Test(priority = 2)
    public void check_DemoCanBeScheduled()
    {
        XenetaDemo xenetaDemoPage = homepage.navigateToDemoPage();
        Assert.assertTrue(xenetaDemoPage.scheduleOneOnOneDemo().contains("scheduledemo"),"The schedule demo page is not opened");
    }

    @Test(priority = 1)
    public void check_DemoCanBeWatched()
    {
        XenetaDemo xenetaDemoPage = homepage.navigateToDemoPage();
        Assert.assertTrue(xenetaDemoPage.watchNow().contains("watchdemo"),"The watch now demo page is not opened");
    }


    @Test(priority = 3)
    public void check_CanSignUp()
    {
        XenetaDemo xenetaDemoPage = homepage.navigateToDemoPage();
        Assert.assertTrue(xenetaDemoPage.signUp().contains("live-group-demo-sign-up"),"The sign up page is not opened");
    }

}
