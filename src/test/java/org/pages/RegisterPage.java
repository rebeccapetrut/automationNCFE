package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class RegisterPage extends BasePage {

    @FindBy(css = ".twitter-typeahead input:nth-child(2)")
    private WebElementFacade productSearchField; //arrow down si dupa enter ca sa ia produsu

    @FindBy(css = ".tt-dataset.tt-dataset-searchDataset")
    private WebElementFacade productNameList;

    @FindBy(id = "deliveryTime")
    private WebElementFacade competitionYearDropdown;

    @FindBy(id = "availableSessions") //vine prestabilit
    private WebElementFacade availableSessionsDropdown;

    @FindBy(css = ".formControlPaddingNarrow th:nth-child(3) input")
    private WebElementFacade foreNameField;

    @FindBy(css = ".formControlPaddingNarrow th:nth-child(5) input")
    private WebElementFacade sureNameField;

    @FindBy(css = ".formControlPaddingNarrow th:nth-child(6) input")
    private WebElementFacade dobField;

    @FindBy(id = "gender")
    private WebElementFacade genderDropdown;

    @FindBy(css = "[title='Add Learner']")
    private WebElementFacade addLearnerButton;

    @FindBy(css = ".row.justify-content-end button")
    private WebElementFacade nextButton;

    @FindBy(css = ".d-flex button:nth-child(2)")
    private WebElementFacade finishButton;

    @FindBy(css = ".container-lg.util-padding-bottom-50 div:nth-child(2) div:nth-child(2) div:nth-child(1) div  div p:nth-child(1) strong")
    private WebElementFacade registerVerificationText; //css ??




    public void setProductSearchField(String productName){
        typeInto(productSearchField,productName);
        waitFor(2);
        clickOn(productNameList);
        withAction().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        //redo the enter and arrow - sau daca e ok sa dea click pe produs in loc sa dea enter?
    }

    public void setCompetitionYear(String competitionYear){
        competitionYearDropdown.selectByValue(competitionYear);
    }


    public void setForeNameField(String forName){
        typeInto(foreNameField, forName);
    }

    public void setSureNameField(String surName){
        typeInto(sureNameField, surName);
    }

    public void setDobField(String dob){
        typeInto(dobField, dob);
    }

    public void setGenderDropdown(String genderDropdownValue){
        genderDropdown.selectByValue(genderDropdownValue);
    }

    public void clickAddLearnerButton(){
        clickOn(addLearnerButton);
    }

    public void clickNextButton(){
        clickOn(nextButton);
    }

    public void clickFinishButton(){
        clickOn(finishButton);
    }

    public boolean verifyIfUserIsRegistered(){
        return registerVerificationText.isPresent();
    }









}
