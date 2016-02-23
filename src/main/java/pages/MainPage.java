package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class MainPage extends PageBase{

    private final By LOGIN_REFERENCE = By.xpath("//a[@href='/login']");
    private final By LOGIN = By.xpath("//input[@id='username']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickReference()
    {
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(LOGIN_REFERENCE));
        driver.findElement(LOGIN_REFERENCE).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(LOGIN));
    }
}
