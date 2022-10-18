package org.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.utils.EnvConstants;


@UseTestDataFrom("TestData/registerCSVfile.csv")
@RunWith(SerenityParameterizedRunner.class)
public class RegisterTest extends BaseTest {

   // @Test
    public void doRegisterUsingKeyTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        homePageSteps.clickRegisterDropdown();
        homePageSteps.clickRegisterUsingKey();
        registerSteps.setProductSearchField("601/8434/6");
        registerSteps.setCompetitionYear("5");
        registerSteps.setForeNameField("Automation");
        registerSteps.setSurNameField("Person");
        registerSteps.setDob("01/01/2001");
        registerSteps.setGender("2");
        registerSteps.clickAddLearnerButton();
        registerSteps.clickNextButton();
        registerSteps.clickFinishButton();
        registerSteps.verifyUserIsRegistered();
    }

    private String foreName;
    private String surName;
    private String dob;
    private String gender;


    @Test
    public void doRegisterUsingCSVFileTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        homePageSteps.clickRegisterDropdown();
        homePageSteps.clickRegisterUsingKey();
        registerSteps.setProductSearchField("601/8434/6");
        registerSteps.setCompetitionYear("5");
        registerSteps.setForeNameField(foreName);
        registerSteps.setSurNameField(surName);
        registerSteps.setDob(dob);
        registerSteps.setGender("2");
//        registerSteps.clickAddLearnerButton();
//        registerSteps.setForeNameField(foreName);
//        registerSteps.setSurNameField(surName);
//        registerSteps.setDob(dob);
//        registerSteps.setGender("2");
//        registerSteps.clickAddLearnerButton();
//        registerSteps.setForeNameField(foreName);
//        registerSteps.setSurNameField(surName);
//        registerSteps.setDob(dob);
//        registerSteps.setGender("2");
        registerSteps.clickAddLearnerButton();
        registerSteps.clickNextButton();
        registerSteps.clickFinishButton();
        registerSteps.verifyUserIsRegistered();
    }

    public String getForeName(){
        return foreName;
    }

    public void setForeName(String foreName){
        this.foreName = foreName;
    }

    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String setGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }



}
