package MobileActions.AndroidActions;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

public class AndroidActions extends DriverManager{

    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(35);

    public static WebElement waitForElementReadiness(By by) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static WebElement waitForElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void click(By by) {
            waitForElementReadiness(by);

            WebElement element = waitForElementClickable(by);
            element.click();
    }

    public static void type(By by, String str) {
        waitForElementReadiness(by);

        WebElement element = waitForElementClickable(by);
        element.sendKeys(str);
    }

    public static void clear(By by) {
        waitForElementReadiness(by);

        WebElement element = waitForElementClickable(by);
        element.clear();
    }

    public static String getElementText(By by) {
        WebElement element = waitForElementReadiness(by);
        return element.getText();
    }

    public static Boolean compareDateWithCurrentDate(By by) {
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        String futuredate = DriverManager.driver.findElement(by).getText();
        String currentDate = format.format(new Date());

        System.out.println(futuredate);
        System.out.println(currentDate);

        if(futuredate.compareTo(currentDate) > 0)
        {
            return true;
        }

            return false;

    }


}
