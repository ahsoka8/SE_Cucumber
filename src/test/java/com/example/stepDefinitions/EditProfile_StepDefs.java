package com.example.stepDefinitions;

import com.example.pages.EditProfilePage;
import com.example.utilities.BrowserUtils;
import io.cucumber.java.en.And;

public class EditProfile_StepDefs {

    EditProfilePage editProfilePage = new EditProfilePage();

    @And("The user adds {string} {string}")
    public void theUserAdds(String profileBox, String userInfo) {
        editProfilePage.editProfileInfo(profileBox, userInfo);
    }

    @And("The user selects {string} from the menu")
    public void theUserSelectsFromTheMenu(String job) {
        editProfilePage.selectJob(job);
    }

    @And("The user clicks on save changes button")
    public void theUserClicksOnSaveChangesButton() {
        BrowserUtils.clickWithJS(  editProfilePage.changeBtn);
    }
}
