package net.Trycloud.pages;

import net.Trycloud.utilities.ConfigurationReader;
import net.Trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement LogInBTN;


    public void logInWithSuccess() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        this.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        this.LogInBTN.click();
    }


}
