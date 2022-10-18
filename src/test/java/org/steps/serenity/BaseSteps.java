package org.steps.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.pages.RegisterPage;

public class BaseSteps extends ScenarioSteps {

    public LoginPage loginPage;
    public HomePage homePage;
    public RegisterPage registerPage;
}
