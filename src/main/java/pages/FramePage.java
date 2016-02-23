package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nick on 16.02.2016.
 */
public class FramePage extends PageBase {
    // By logOut = By.cssSelector(".icon-2x.icon-signout");
    private final String FRAME_ID = "mce_0_ifr";
    private final By TEXT_AREA = By.xpath("//*[@id='tinymce']");
    private final By BOLD_BUTTON = By.xpath("//div[@id='mceu_3']/button");

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public String getFRAME_ID() {
        return FRAME_ID;
    }

    public By getTEXT_AREA() {
        return TEXT_AREA;
    }

    public By getBOLD_BUTTON() {
        return BOLD_BUTTON;
    }
}
