package com.example.pages;

import com.example.utilities.Driver;
import com.example.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public abstract void verifyPageTitle();

    @FindBy(css = ".nav-item")
    public List<WebElement> tabMenu;


    @FindBy(css=".d-none.d-md-block.dropdown-toggle.ps-2")
    public WebElement userNameAtRightTop;

    public List getTabMenuNames() {
        List<String> list = new ArrayList<>();
        for (WebElement menu : tabMenu) {
            list.add(menu.getText());
        }
        return list;
    }

    public void navigateToTabsAndModules(String tabName) {
        WebElement tab = Driver.get().findElement(By.xpath("//span[text()='" + tabName + "']"));
        tab.click();
    }

    public void navigateToTabsAndModules(String tabName, String modulName) {
        WebElement tab = Driver.get().findElement(By.xpath("//span[text()='" + tabName + "']"));
        tab.click();
        if (!modulName.isEmpty()) {
            WebElement module = Driver.get().findElement(By.xpath("//span[text()='" + modulName + "']"));
            module.click();
        }
    }


    public String getUsernameText(){
        return userNameAtRightTop.getText();
    }


    public List <Map<String, String>> getExcelData(String path, String sheetName){
        ExcelUtil excelUtil= new ExcelUtil(path,sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;
    }


}
