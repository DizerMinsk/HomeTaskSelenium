package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static helpers.Locators.get;

/**
 * Created by Nick on 16.02.2016.
 */
public class LoginPageWithLocators extends PageBase{

    private static final By LOGIN = get("LoginPage.LoginNameInput");
    private final By PASSWORD = get("LoginPage.PasswordInput");
    private final By BUTTON_LOGIN =get("LoginPage.LoginButton");
    private final By INVALID_MESSAGE = get("LoginPage.InvalidMessage");

    public LoginPageWithLocators(WebDriver driver) {
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
