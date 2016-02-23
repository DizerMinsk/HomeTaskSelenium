import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FramePage;
import pages.MainPageFrame;


import java.util.List;


/**
 * Created by Nick on 15.02.2016.
 */
public class TestFrame extends TestBase{

    public String textToPrint1 = "Привет, ";
    public String textToPrint2 = "МИР!";
    public String textToPrint3 = " Я умею работать с фреймами.";


    @Test
    public void test1() throws InterruptedException {

        MainPageFrame mainPage = new MainPageFrame(driver);
        mainPage.clickReference();
        FramePage framePage = new FramePage(driver);

        driver.switchTo().frame(framePage.getFRAME_ID());

        driver.findElement(framePage.getTEXT_AREA()).click();
        driver.findElement(framePage.getTEXT_AREA()).clear();
        driver.findElement(framePage.getTEXT_AREA()).sendKeys(textToPrint1);
        driver.switchTo().defaultContent();
        driver.findElement(framePage.getBOLD_BUTTON()).click();
        driver.switchTo().frame(framePage.getFRAME_ID());
        driver.findElement(framePage.getTEXT_AREA()).sendKeys(textToPrint2);
        driver.switchTo().defaultContent();
        driver.findElement(framePage.getBOLD_BUTTON()).click();
        driver.switchTo().frame(framePage.getFRAME_ID());
        driver.findElement(framePage.getTEXT_AREA()).sendKeys(textToPrint3);

        String text = driver.findElement(framePage.getTEXT_AREA()).getText();
        //replace bold from string
        String textToEqual = text.substring(0, 8) + text.substring(9, 13) + text.substring(14, 42);
        Assert.assertEquals(textToEqual,textToPrint1+textToPrint2+textToPrint3);



        }


    }


