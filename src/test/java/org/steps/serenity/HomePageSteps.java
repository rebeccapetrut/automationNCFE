package org.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.pages.BasePage;

public class HomePageSteps extends BaseSteps {

    @Step
    public void clickRegisterDropdown(){
        homePage.clickRegisterDropdown();
    }

    @Step
    public void clickRegisterUsingKey(){
        homePage.clickRegisterUsingKeyOrCSVButton();
    }

}
