package com.example.pages;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage{

@FindBy(xpath = "//input[@id='job']")
public WebElement jobBox;

@FindBy(xpath = "//button[@value='experience']")
public WebElement addExperienceBtn;

public void fillOutTheAddExperienceForm(String fromDate, String toDate){
    Actions actions = new Actions(Driver.get());
    actions.click(jobBox)
            .sendKeys(ConfigurationReader.get("jobTitle")+ Keys.TAB)
            .sendKeys(ConfigurationReader.get("company")+Keys.TAB)
            .sendKeys(ConfigurationReader.get("location")+Keys.TAB)
            .sendKeys(fromDate+Keys.TAB+ Keys.TAB)
            .sendKeys(toDate+Keys.TAB)
            .sendKeys(ConfigurationReader.get("jobDescription")+Keys.TAB+Keys.ENTER).perform();
}


    /*
    Faker faker = new Faker();
    @FindBy(xpath = "//div/button[text()='Add Experience']")
    public WebElement addExperienceBtn;

    @FindBy(css = "input#job")
    public WebElement jobTitle;



    public String jobTitleName = faker.job().title();
    String companyName=faker.company().name();
    String locationName=faker.address().cityName();
    String fromDate="11112020";
    String toDate="10102022";
    String jobDescription= faker.lorem().characters(25,false,false);

    public void addExperienceMtd() {
        Actions actions = new Actions(Driver.get());

        actions.click(jobTitle)
                .sendKeys(jobTitleName+ Keys.TAB)
                .sendKeys(companyName + Keys.TAB)
                .sendKeys(locationName + Keys.TAB)
                .sendKeys(fromDate + Keys.TAB + Keys.TAB)
                .sendKeys(toDate + Keys.TAB)
                .sendKeys(jobDescription + Keys.TAB +Keys.ENTER).perform();
    }*/

    @Override
    public void verifyPageTitle() {

    }
}
