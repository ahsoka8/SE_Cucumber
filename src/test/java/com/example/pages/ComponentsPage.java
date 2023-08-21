package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends BasePage {

    @FindBy(linkText = "Home")
    public WebElement homeButton;

    @FindBy(css = "#main li:nth-of-type(2)")
    public WebElement dashboardText;


    @FindBy(css = "#main li:nth-of-type(3)")
    public WebElement title3;


    public String getHomeButtonText() {
        return homeButton.getText();
    }

    public String getDashboardText() {
        return dashboardText.getText();
    }


    public String getTitle3Text() {
        return title3.getText();
    }

    @Override
    public void verifyPageTitle() {

    }
}
