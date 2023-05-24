package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {
    @Then("^I see Welcome message$")
    public void iSeeWelcomeMessage() {
        Assert.assertEquals("Not displayed:", "Dashboard", new LoginPage().verifyLogin());
    }

    @Then("^I see the Orange HRM Logo$")
    public void iSeeTheOrangeHRMLogo() {
        Assert.assertEquals("Not Displayed", "", new DashboardPage().verifyOrangeLogo());
    }

    @When("^I click on user profile logo$")
    public void iClickOnUserProfileLogo() throws InterruptedException {
        new HomePage().userProfileLogoClick();
    }

    @And("^I mouse hover and click on logout$")
    public void iMouseHoverAndClickOnLogout() throws InterruptedException {
        new HomePage().MouseHoverLogo();
    }

    @Then("^I am logged out and see text Login Panel$")
    public void iAmLoggedOutAndSeeTextLoginPanel() {
        Assert.assertEquals("Not Displayed.", "Login", new LoginPage().getVerifyLogin());
    }
}
