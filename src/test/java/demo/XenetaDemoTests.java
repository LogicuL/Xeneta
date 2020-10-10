package demo;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.XenetaDemo;

public class XenetaDemoTests extends BaseTests
{

    @Test
    public void check_DemoPageIsDisplayed()
    {
        XenetaDemo xenetaDemoPage = homepage.navigateToDemoPage();
        Assert.assertTrue(xenetaDemoPage.demoPageIsDisplayed(),"The Demo page was not loaded");
    }

}
