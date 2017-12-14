package io.snov.app;

import io.snov.app.Pages.LoginPage;
import io.snov.app.Pages.RegistrationPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegTests extends BaseTest {

    @Test
    public void SuccessRegistration() throws Exception {

        LoginPage.link_to_sign_up.click();
        RegistrationPage.Register("123", "test@test.test", "qweasd123", "qweasd1234");
    }
}
