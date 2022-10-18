package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage{

    @FindBy(css = ".util-padding-bottom-0")
    private WebElementFacade welcomeText;

    @FindBy(css = "#navbarCollapse ul li:nth-child(2) .nav-link.dropdown-toggle") //#navbarCollapse ul li:nth-child(2) .nav-link.dropdown-toggle //.nav-item.dropdown.show
    private WebElementFacade registerDropdownButton;

    @FindBy(css = ".nav-item.dropdown.show div div:first-child a")
    private WebElementFacade registerUsingKeyOrCSV;

    @FindBy(css = ".nav-item.dropdown.show div div:nth-child(2) a")
    private WebElementFacade registerTribalBulkCSV;





    public boolean verifyUserIsLoggedIn(String userName){
        return welcomeText.getText().equalsIgnoreCase("Welcome " +userName+ " to the Portal.");
    }

    public void clickRegisterDropdown(){
        clickOn(registerDropdownButton);
    }

    public void clickRegisterUsingKeyOrCSVButton(){
        clickOn(registerUsingKeyOrCSV);
    }







}
