package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class SecureArea extends PageBase {
    public By logOut = By.cssSelector(".icon-2x.icon-signout");

    public SecureArea(WebDriver driver) {
        super(driver);
    }
}
