import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageWithLocators;
import pages.MainPage;
import pages.SecureArea;

/**
 * Created by Nick on 15.02.2016.
 */
public class TestAuthentification_UIMap extends TestBase{

    private final String LOGIN = "tomsmith";
    private final String PASSWORD = "SuperSecretPassword!";

    @Test
    public void test1() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        LoginPageWithLocators loginPage = new LoginPageWithLocators(driver);
        SecureArea secureArea = new SecureArea(driver);


        mainPage.clickReference();
        loginPage.setLogin(LOGIN, PASSWORD);
        Assert.assertTrue(secureArea.elementShouldBeDisplayed(secureArea.logOut));
    }

}
