package com.example.stepDefinitions;

import com.example.pages.ComponentsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Components_StepDefs {

    ComponentsPage componentsPage = new ComponentsPage();

    @Then("Verify that {string},{string} and {string}")
    public void verifyThatAnd(String str, String str1, String str2) {
        Assert.assertEquals(str, componentsPage.getHomeButtonText());
        Assert.assertEquals(str1, componentsPage.getDashboardText());
        Assert.assertEquals(str2, componentsPage.getTitle3Text());
    }
}
