package com.example.stepDefinitions;

import com.example.pages.UserProfilePage;
import com.example.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserProfile_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();

    @Then("The user should be able to see following subMenu")
    public void the_user_should_be_able_to_see_following_sub_menu(List<String> expextedSubMenu) {
        UserProfilePage userProfilePage = new UserProfilePage();
        List<String> actualList = BrowserUtils.getElementsText(userProfilePage.tablist);
        System.out.println("expextedSubMenu = " + expextedSubMenu);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expextedSubMenu, actualList);

    }

    @And("The user navigates to {string}")
    public void theUserNavigatesTo(String submenu) {
        userProfilePage.navigateUserProfileTabs(submenu);

    }


    @Then("The user should be able to see last added education record with {string}")
    public void the_user_should_be_able_to_see_last_added_education_record_with(String school) {
        String actualSchoolRecord = userProfilePage.addedEducationName(school);
        Assert.assertEquals(school, actualSchoolRecord);
    }

    @Then("The user should be able to delete last added record with {string}")
    public void the_user_should_be_able_to_delete_last_added_record_with(String school) {
        userProfilePage.deleteEducationLastRecord(school);

    }


}
