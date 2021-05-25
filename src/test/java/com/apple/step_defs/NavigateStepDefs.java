package com.apple.step_defs;

import com.apple.pages.BasePage;
import com.apple.pages.iPadProPage;
import com.apple.utilities.BrowserUtils;
import com.apple.utilities.ConfigurationReader;
import com.apple.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateStepDefs {
    BasePage basePage = new BasePage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("the user navigate to {string} {string}")
    public void the_user_navigate_to(String tab, String module) {
        BrowserUtils.waitForPageToLoad(10);
        basePage.appleNavigator(tab, module);
    }
    @Then("the subtitle should be {string}")
    public void the_subtitle_should_be(String subtitle) {
        iPadProPage ipadPropage = new iPadProPage();
        String pageTitle = Driver.get().getTitle();
        Assert.assertTrue(pageTitle.contains(subtitle));

    }

}
