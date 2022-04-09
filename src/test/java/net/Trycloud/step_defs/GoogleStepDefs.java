package net.Trycloud.step_defs;

import net.Trycloud.pages.GooglePage;
import net.Trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefs {
    GooglePage gp = new GooglePage();

    @Given("user is on google main page")
    public void user_is_on_google_main_page() {
        Driver.getDriver().get("https://www.google.com/");


    }

    @When("user enter {string} in search box")
    public void user_enter_in_search_box(String searchWord) {

        gp.searchBox.sendKeys(searchWord + Keys.ENTER);


    }

    @Then("user verifies page tittle contains {string}")
    public void user_verifies_page_tittle_contains(String expectedWord) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedWord));


    }

}
