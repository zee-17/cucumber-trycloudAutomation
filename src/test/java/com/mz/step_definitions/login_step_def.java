package com.mz.step_definitions;

import com.mz.pages.LoginPage;
import com.mz.utilities.ConfigurationReader;
import com.mz.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_step_def {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("user on the log in")
    public void user_on_the_log_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user use username {string} and passcode {string} one")
    public void user_use_username_and_passcode_one(String username, String password) {
loginPage.userNam.sendKeys(username);
loginPage.password.sendKeys(password);
    }
    @When("user click the log in button")
    public void user_click_the_log_in_button() {
loginPage.loginButton.click();
    }
    @Then("Verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
//String titleDashboard = Driver.getDriver().getTitle();
//        Assert.assertTrue(titleDashboard.contains("Dashboard"));

        wait.until(ExpectedConditions.titleContains("Dashboard"));

    }
}
