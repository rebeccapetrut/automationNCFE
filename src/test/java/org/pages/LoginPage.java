package org.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "txtUsername")
    private WebElementFacade userNameField;

    @FindBy(id = "txtPassword")
    private WebElementFacade passwordField;

    @FindBy(id = "btnPortalUserLogin")
    private WebElementFacade loginButton;

    public void setUserNameField(String userName){
        typeInto(userNameField, userName);
    }

    public void setPasswordField(String password){
        typeInto(passwordField,password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

}
