package com.example.stepDefinitions;

import com.example.pages.DashboardPage;
import com.example.pages.LoginPage;
import com.example.utilities.ConfigurationReader;
import com.example.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters Leia's credentials")
    public void the_user_enters_leia_s_credentials() {
        loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedUrl, actualUrl);

        /*DashboardPage dashboardPage = new DashboardPage();
        String actualUserName = dashboardPage.userName.getText();
        String expectedUserName = ConfigurationReader.get("userName");

        Assert.assertEquals("should be same", expectedUserName, actualUserName);*/
    }


    @When("The user enters HanSolo's credentials")
    public void the_user_enters_han_solo_s_credentials() {
        loginPage.login("mike@gmail.com", "mike1234");

    }

    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        loginPage.login("rosa@test.com", "Test123456");
    }

    @When("The user enters John's credentials")
    public void the_user_enters_john_s_credentials() {
        loginPage.login("john@gmail.com", "John1234.");
    }

    @When("The user logs in with using credentials {string} and {string}")
    public void the_user_logs_in_with_using_credentials_and(String userEmail, String userPassword) {
        loginPage.login(userEmail, userPassword);
    }


    @Then("Verify that warning message is {string}")
    public void verify_that_warning_message_is(String expectedMessage) {
        String actualMessage = loginPage.getWarningMessageText(expectedMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("The number is {int}")
    public void theNumberIs(int number) {
        System.out.println("number = " + number);
    }


    @And("The number also is {double}")
    public void theNumberAlsoIs(double number) {
        System.out.println("number = " + number);
    }

    @And("The number can be {double}")
    public void theNumberCanBe(Double double1) {
        System.out.println("double1 = " + double1);
    }

    @When("The user logins with following credentials")
    public void theUserLoginsWithFollowingCredentials(List<String> userCredentials) {
        loginPage.login(userCredentials.get(0), userCredentials.get(1) );
    }
}
