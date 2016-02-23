import base.TestBase;
import pages.LoginPage;
import pages.MainPage;
import pages.SecureArea;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nick on 15.02.2016.
 */
public class TestAuthentification extends TestBase{

    private final String LOGIN = "tomsmith";
    private final String PASSWORD = "SuperSecretPassword!";

    @Test
    public void test1() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SecureArea secureArea = new SecureArea(driver);


        mainPage.clickReference();
        loginPage.setLogin(LOGIN, PASSWORD);
        Assert.assertTrue(secureArea.elementShouldBeDisplayed(secureArea.logOut));
    }

}
