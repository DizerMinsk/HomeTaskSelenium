package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nick on 16.02.2016.
 */
public class LoginPage extends PageBase{

    private final By LOGIN = By.xpath("//input[@id='username']");
    private final By PASSWORD = By.cssSelector("input#password");
    private final By BUTTON_LOGIN = By.className("radius");
    private final By INVALID_MESSAGE = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setLogin(String login, String password)
    {
        driver.findElement(getLOGIN()).sendKeys(login);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(BUTTON_LOGIN).click();
    }

    public By getLOGIN() {
        return LOGIN;
    }
}
