package pageObjects;

import MobileActions.AndroidActions.AndroidActions;
import MobileActions.GenericMethods.JsonFileMethods;
import commonAssertion.commonAssertion;

public class loginHelper extends loginElements {
    static commonAssertion commonAssertionObj;

    public static void clicksOnMenu() {
        AndroidActions.click(menuBtn);
    }

    public static void clicksOnLogin() {
        AndroidActions.click(loginBtn);
    }

    public static void fillUsername() {
        AndroidActions.clear(usernameTextField);
        AndroidActions.type(usernameTextField, JsonFileMethods.getValueFromJson(credentials,"username"));
    }

    public static void fillPassword() {
        AndroidActions.clear(usernameTextField);
        AndroidActions.type(passwordTextField, JsonFileMethods.getValueFromJson(credentials,"password"));
    }

    public static void clicksOnLoginButton() {
        AndroidActions.click(loginBtnInLoginPage);
    }

    public static void verifyThatLoginSuccessfully() {
        commonAssertion.assertTrue(commonAssertion.verifyElementTextEquals(productText,"Sauce Labs Backpack"));
    }

    public static void fillNoPassword() {
        AndroidActions.type(usernameTextField, JsonFileMethods.getValueFromJson(credentials,"username"));
        AndroidActions.type(passwordTextField, JsonFileMethods.getValueFromJson(Data,"noPassword"));


    }

    public static void verifyThatNoPasswordErrorMessage() {
        commonAssertion.assertTrue(commonAssertion.verifyElementTextEquals(requiredPasswordTxt,"Password is required"));

    }

    public static void fillNoUserDetails() {
        AndroidActions.clear(usernameTextField);
        AndroidActions.type(usernameTextField, JsonFileMethods.getValueFromJson(Data,"noUsername"));
        AndroidActions.clear(passwordTextField);
        AndroidActions.type(passwordTextField, JsonFileMethods.getValueFromJson(Data,"noPassword"));

    }

    public static void verifyThatNoUsernameErrorMessage() {
        commonAssertion.assertTrue(commonAssertion.verifyElementTextEquals(requiredUsernameTxt,"Username is required"));

    }

    public static void fillNoMatchDetails() {
        AndroidActions.clear(usernameTextField);
        AndroidActions.type(usernameTextField, JsonFileMethods.getValueFromJson(Data,"noMatchUsername"));
        AndroidActions.clear(passwordTextField);
        AndroidActions.type(passwordTextField, JsonFileMethods.getValueFromJson(Data,"noMatchPassword"));

    }

    public static void verifyThatNoMatchErrorMessage() {
        commonAssertion.assertTrue(commonAssertion.verifyElementTextEquals(noMatchTxt,"Provided credentials do not match any user in this service."));

    }

    public static void fillLockedUser() {
        AndroidActions.clear(usernameTextField);
        AndroidActions.type(usernameTextField, JsonFileMethods.getValueFromJson(Data,"lockedUsername"));
        AndroidActions.clear(passwordTextField);
        AndroidActions.type(passwordTextField, JsonFileMethods.getValueFromJson(Data,"lockedPassword"));

    }

    public static void verifyThatLockedErrorMessage() {
        commonAssertion.assertTrue(commonAssertion.verifyElementTextEquals(lockedTxt,"Sorry, this user has been locked out."));

    }
}
