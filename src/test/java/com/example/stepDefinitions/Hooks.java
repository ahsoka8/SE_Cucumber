package com.example.stepDefinitions;

import com.example.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before(order=0)
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After(order=0)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }

    @Before(value= "@database", order=1) // feature daki burada yayilan tag a sahip senaryo calismadan once hooks taki bu method calisir
    //order da calisma sirasini gösterir 0 once genel olan üstteki methotlar calisir sonra 1 olan calisir
    public void openDatabase(){
        System.out.println("Database is opening");
    }

    @After(value= "@database", order =1)
    public void closeDatabase(){
        System.out.println("Database is closing");
    }
}
