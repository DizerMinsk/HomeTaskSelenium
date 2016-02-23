import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import pages.MainPageHovers;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nick on 15.02.2016.
 */
public class TestHovers extends TestBase{

    @Test
    public void test1() throws InterruptedException {

        MainPageHovers mainPage = new MainPageHovers(driver);
        mainPage.clickReference();
        HoversPage hoversPage = new HoversPage();

        List<WebElement> images =  driver.findElements(hoversPage.getDIV_IMAGE());

        Actions builder = new Actions(driver);

        int k = 1;
        for (WebElement i : images)
        {
            builder.moveToElement(i).build().perform();
            Thread.sleep(2000);//для визульного отражения:)
            Assert.assertTrue(driver.findElement(hoversPage.getREFERENCE_USERS(k)).isDisplayed());
            k +=1;
        }


    }

}
