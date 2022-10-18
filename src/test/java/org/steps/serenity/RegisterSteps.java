package org.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class RegisterSteps extends BaseSteps {

    @Step
    public void setProductSearchField(String productNane){
        registerPage.setProductSearchField(productNane);
    }

    @Step
    public void setCompetitionYear(String competitionYear){
        registerPage.setCompetitionYear(competitionYear);
    }

    @Step
    public void setForeNameField(String forName){
        registerPage.setForeNameField(forName);
    }

    @Step
    public void setSurNameField(String surName){
        registerPage.setSureNameField(surName);
    }

    @Step
    public void setDob(String dob){
        registerPage.setDobField(dob);
    }

    @Step
    public void setGender(String gender){
        registerPage.setGenderDropdown(gender);
    }

    @Step
    public void clickAddLearnerButton(){
        registerPage.clickAddLearnerButton();
    }

    @Step
    public void clickNextButton(){
        registerPage.clickNextButton();
    }

    @Step
    public void clickFinishButton(){
        registerPage.clickFinishButton();
    }

    @Step
    public void verifyUserIsRegistered(){
        Assert.assertTrue(registerPage.verifyIfUserIsRegistered());
    }



}
