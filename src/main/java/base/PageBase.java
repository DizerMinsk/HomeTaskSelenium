package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class PageBase {
    protected WebDriver driver;

    public PageBase (WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean elementShouldBeDisplayed (By element)
    {
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(element));

            //вот тут если не дождалось элемента - кидает ексепшн который снизу
            //как котч правильно сделать?
            return true;
        }
        catch (org.openqa.selenium.TimeoutException ex)
        {
            ex.fillInStackTrace();
            return false;
        }
    }
}
