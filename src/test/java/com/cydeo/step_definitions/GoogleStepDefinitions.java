package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {
        String expTitle = "Google";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actTitle,expTitle);
    }

}
