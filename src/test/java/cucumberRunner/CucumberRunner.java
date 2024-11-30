package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

@CucumberOptions(features = {"src/test/java/featureFiles/"}
        , glue = {"stepDefinition"}
        , tags = "@Regression"
        , plugin = {"json:target/cucumber-reports/CucumberTestReport.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

public class CucumberRunner extends AbstractTestNGCucumberTests
{
    @BeforeMethod
    public static void setup() throws MalformedURLException {
        DriverManager.DriverManager.setup();
    }

    @AfterMethod
    public static void tearDown() {
        DriverManager.DriverManager.tearDown();
    }

}
