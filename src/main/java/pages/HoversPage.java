package pages;

import org.openqa.selenium.By;

/**
 * Created by Nick on 20.02.2016.
 */
public class HoversPage {

    private final By DIV_IMAGE = By.xpath("//div[@id='content']/div[@class='example']/div[@class='figure']");
//    private By REFERENCE_USERS;

    public By getDIV_IMAGE() {
        return DIV_IMAGE;
    }

    public By getREFERENCE_USERS(int i)
    {
        return By.xpath("//div[@id='content']/div[@class='example']/div[@class='figure']//a[@href='/users/"+i+"']");
    }
}
