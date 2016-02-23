import base.TestBase;
import org.testng.annotations.DataProvider;
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
public class TestAuthentification_DDT extends TestBase{

    @DataProvider
    public Object[][] testData()
    {
        return new Object[][]{
                new Object[] {"tomsmith","SuperSecretPassword!",true},
                new Object[] {"22222","2222222",false},
                new Object[] {"555555","444444",false}
                };
    }


    @Test (dataProvider = "testData")
    public void test3(String login, String password, boolean isCorrect) throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SecureArea secureArea = new SecureArea(driver);


        mainPage.clickReference();
        loginPage.setLogin(login, password);
        Assert.assertEquals(secureArea.elementShouldBeDisplayed(secureArea.logOut),isCorrect);
    }

}
