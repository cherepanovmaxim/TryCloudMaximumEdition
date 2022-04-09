package net.Trycloud.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.Trycloud.pages.LoginPage;
import net.Trycloud.utilities.ConfigurationReader;
import net.Trycloud.utilities.Driver;
import org.junit.Assert;

public class LoginWithValidCredentialsStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page()
    {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user uses username {string} and passcode {string}")
    public void user_uses_username_and_passcode(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);

    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

        loginPage.LogInBTN.click();
    }

    @Then("verify the user is on the dashboard page")
    public void verify_the_user_is_on_the_dashboard_page() {

        Assert.assertEquals(ConfigurationReader.getProperty("mainPageURL"), Driver.getDriver().getCurrentUrl());

    }

}

