package org.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void enterCredentials(String userName, String password){
        loginPage.setUserNameField(userName);
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
        Assert.assertTrue(homePage.verifyUserIsLoggedIn(userName));
    }

    @Step
    public void doLogin(String userName, String pass){
        loginPage.setUserNameField(userName);
        loginPage.setPasswordField(pass);
        loginPage.clickLoginButton();
    }

}
