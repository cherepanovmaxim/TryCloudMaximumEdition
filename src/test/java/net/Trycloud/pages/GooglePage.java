package net.Trycloud.pages;

import net.Trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy(xpath = "(//input[@value='Google Search'])[1]")
    public WebElement searchBTN;

}
