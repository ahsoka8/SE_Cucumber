package com.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/example/stepDefinitions",
        dryRun = false,
       tags = "@c_ScenarioOutline"
        // tags = "@Leia or @smoke" -> daha fazla and veya or kullanilabilir.
        //  tags = "@Login and @smoke"
        //  tags = "@regression and not @Rosa" -> Rosa haric testlerin hepsi calisir
)


public class CukesRunner {
}
