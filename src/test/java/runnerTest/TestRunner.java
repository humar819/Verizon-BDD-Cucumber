package runnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
plugin : ->is used to generate report
monochrome : provides readable console
publish : if we wanna generate report , you need to type publish = true; otherwise = false
feature : initialize our feature file
tags: initialize tag name in my feature file
glue : initialize my step definition, they must be same spelling
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"},
        monochrome = true,
        dryRun = false,
        publish = true,
        stepNotifications = true,  // it gives notifications if your tests are wrong executed, or have problem
        //Path to your feature file
        features = {"src/test/resources/feature"},
        // Specify tags to be executed
        tags = "@phone",
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepDefinition"}
)



public class TestRunner {
}
