package org.features.search;

import org.junit.Test;
import org.utils.EnvConstants;

public class LoginTest extends BaseTest {

    @Test
    public void doLoginTest(){
        loginSteps.enterCredentials(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.clickLoginButton();
        loginSteps.verifyUserIsLoggedIn("Rebeca Petrut");
    }

}
