package org.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.steps.serenity.HomePageSteps;
import org.steps.serenity.LoginSteps;
import org.steps.serenity.RegisterSteps;
import org.utils.EnvConstants;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximize(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected HomePageSteps homePageSteps;
    @Steps
    protected RegisterSteps registerSteps;



}
