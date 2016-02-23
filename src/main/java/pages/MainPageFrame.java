package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class MainPageFrame extends PageBase{

    private final By FRAME_REFERENCE = By.xpath("//a[@href='/frames']");
    private final By IFRAME_REFERENCE = By.xpath("//a[@href='/iframe']");
    private final By IFRAME = By.xpath("//iframe[@id='mce_0_ifr']");

    public MainPageFrame(WebDriver driver) {
        super(driver);
    }

    public void clickReference()
    {
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(FRAME_REFERENCE));
        driver.findElement(FRAME_REFERENCE).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(IFRAME_REFERENCE));
        driver.findElement(IFRAME_REFERENCE).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(IFRAME));
    }
}
