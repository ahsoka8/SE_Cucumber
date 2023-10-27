package com.example.stepDefinitions;

import com.example.pages.DashboardPage;
import com.example.utilities.BrowserUtils;
import com.example.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Then("The user verifies success login with {string} using excel file:{string}, {string} and {int}")
    public void the_user_verifies_success_login_with_using_excel_file_and(String nameColumnHeaders, String path, String sheetName, Integer row) {
        List<Map<String, String>> dataList = dashboardPage.getExcelData(path, sheetName);
        String expectedName= dataList.get(row).get(nameColumnHeaders);
        String actualName= dashboardPage.getUsernameText();

        Assert.assertEquals(expectedName,actualName);
    }

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
    List<String> actualList= new ArrayList<>();
    for(WebElement e: dashboardPage.tabMenu){
        actualList.add(e.getText());
    }
//2th way
    List<String> actualList02 =BrowserUtils.getElementsText(dashboardPage.tabMenu);
    actualList02:
    System.out.println("actualList02 = " + actualList02);
        System.out.println("actualList = " + actualList);
    Assert.assertEquals(expectedList,actualList);

    }








}
