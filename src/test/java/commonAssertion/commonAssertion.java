package commonAssertion;

import DriverManager.DriverManager;
import MobileActions.AndroidActions.AndroidActions;
import org.openqa.selenium.By;
import org.testng.Assert;


public class commonAssertion extends AndroidActions {

    public static boolean verifyElementTextEquals(By by, String text) {
        waitForElementReadiness(by);
        return DriverManager.driver.findElement(by).getText().equals(text);
    }

    public static void assertTrue(Boolean condition) {
        Assert.assertTrue(condition);
    }

}
