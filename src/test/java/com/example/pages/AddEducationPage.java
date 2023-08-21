package com.example.pages;

import com.example.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEducationPage extends BasePage {

    @FindBy(id = "school")
    public WebElement schoolBox;


    @FindBy(xpath = "//div/button[text()='Add Education']")
    public WebElement addEducationBtn;

    @FindBy(xpath = "//div[@id='education-add']//label[not(@for='current')]")
    public List<WebElement> formLabels;

    @FindBy(xpath = "//div[@id='education-add']//label")
    public List<WebElement> formLabelsWithCurrentDate;
    public void fillingAddEducationForm(String schoolName, String degree, String study, String fromDate, String toDate, String description) {
        Actions actions = new Actions(Driver.get());
        actions.click(schoolBox)
                .sendKeys(schoolName + Keys.TAB)
                .sendKeys(degree + Keys.TAB)
                .sendKeys(study + Keys.TAB)
                .sendKeys(fromDate + Keys.TAB + Keys.TAB)
                .sendKeys(toDate + Keys.TAB)
                .sendKeys(description + Keys.TAB + Keys.ENTER).perform();

    }


    @Override
    public void verifyPageTitle() {

    }
}
