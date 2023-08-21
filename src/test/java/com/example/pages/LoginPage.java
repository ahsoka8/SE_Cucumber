package com.example.pages;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage {

/*

    public LoginPage() {    ->   Parent Class da oldugundan burada tanimlamaya ihtiyac yok
        PageFactory.initElements(Driver.get(), this);
    }
*/

    @FindBy(id = "email")
    public WebElement emailBox;
    // WebElement emailBox = driver.findElement (By.id("email"));
    // Seleniumdan gelir. Page Object Model ile ilgili hersey Selenium kaynaklidir


    @FindBy(id = "yourPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginBtn;


    //AND Logic ile calisir Iki findBy'in dogru olmasi gerekir.
    @FindBys({
            @FindBy(css = "#email"),
            @FindBy(xpath = "//input[@name ='email']")
    })
    public WebElement emailBoxWithFindBys;


    //OR Logic ile calisir Iki findBy'dan birinin dogru olmasi gerekir.
    @FindAll({
            @FindBy(css = "#yourPassword"),
            @FindBy(css= ".classFake")
    })
    public WebElement passwordBoxWithFindAll;

    @FindBy(xpath = "//div[contains (text(), 'Password is incorrect')]")
    public WebElement wrongPasswordWarningMessage;

    @FindBy(xpath = "//div[contains (text(), 'Email address is incorrect.')]")
    public WebElement wrongEmailWarningMessage;


    @FindBy(css = ".form-control, button")
    public List<WebElement> loginInputs;

    public void login (String userEmail, String userPassword){
        emailBox.sendKeys(userEmail);
        passwordBox.sendKeys(userPassword);
        loginBtn.click();
    }


    public void login (){
        emailBox.sendKeys(ConfigurationReader.get("userEmail"));
        passwordBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginBtn.click();
    }


    public String getWarningMessageText(String message){

        return Driver.get().findElement(By.xpath("//div[contains(text(), '"+message+"')]")).getText();
    }


    @Override
    public void verifyPageTitle() {

    }
}
