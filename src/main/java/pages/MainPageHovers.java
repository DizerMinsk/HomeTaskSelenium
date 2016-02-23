package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class MainPageHovers extends PageBase{

    private final By HOVERS_REFERENCE = By.xpath("//a[@href='/hovers']");
    private final By HOVER = By.xpath("//a[@href='/users/1']");

    public MainPageHovers(WebDriver driver) {
        super(driver);
    }

    public void clickReference()
    {
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(HOVERS_REFERENCE));
        driver.findElement(HOVERS_REFERENCE).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(HOVER));
    }
}
