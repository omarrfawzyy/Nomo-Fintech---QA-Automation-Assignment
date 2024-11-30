package pageObjects;

import org.openqa.selenium.By;

public class loginElements {

    public static String credentials = "src/main/resources/Credentials.json";
    public static String Data = "src/main/resources/Data.json";

    static By menuBtn =  By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    static By loginBtn =  By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    static By usernameTextField =  By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]");
    static By passwordTextField =  By.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]");
    static By loginBtnInLoginPage =  By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    static By productText =  By.xpath("//android.widget.TextView[@content-desc=\"store item text\" and @text=\"Sauce Labs Backpack\"]");
    static By requiredPasswordTxt =  By.xpath("//android.widget.TextView[@text=\"Password is required\"]");
    static By requiredUsernameTxt =  By.xpath("//android.widget.TextView[@text=\"Username is required\"]");
    static By noMatchTxt =  By.xpath("//android.widget.TextView[@text=\"Provided credentials do not match any user in this service.\"]");
    static By lockedTxt =  By.xpath("//android.widget.TextView[@text=\"Sorry, this user has been locked out.\"]");



}
