package com.example.stepDefinitions;

import com.example.pages.DashboardPage;
import com.example.utilities.BrowserUtils;
import com.example.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify that username {string} is displayed on dashboard page")
    public void verify_that_username_is_displayed_on_dashboard_page(String username) {
        String actualUsername = dashboardPage.getUsernameText();
        // asagidakiler de ayni sekilde actualUsername i getirir
        //dashboardPage.userNameAtRightTop.getText();
        //dashboardPage.userName.getText();
        String expectedUsername = username;
        Assert.assertEquals("should be same", expectedUsername, actualUsername);
    }

    @And("The user navigates to {string} and {string}")
    public void theUserNavigatesToAnd(String menu, String submenu) {
        dashboardPage.navigateToTabsAndModules(menu,submenu);
        BrowserUtils.waitFor(3);
    }
}
