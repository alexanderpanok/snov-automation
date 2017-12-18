package io.snov.app;

import com.codeborne.selenide.Condition;
import io.snov.app.Pages.LoginPage;
import io.snov.app.Pages.RegistrationPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertTrue;

public class RegTests extends BaseTest {

    @Test
    public void SuccessRegistration() throws Exception {

        LoginPage.link_to_sign_up.click();
        RegistrationPage.Register("test", "test"+Math.random()+"@test.co", "qweasd123", "qweasd123");
        RegistrationPage.cofirmation_info_msg.waitUntil(Condition.appear,10000);
        assertTrue(RegistrationPage.cofirmation_info_msg.getText().contains("Thank you for signing up for Snovio. Please, check your email to confirm registration."));
    }

    @Test
    public void FailRegistrationEmptyFields() throws Exception {
        LoginPage.link_to_sign_up.click();
        RegistrationPage.Register("", "", "", "");
        assertTrue (RegistrationPage.name_err.getText().contains("The name field is required."));
        assertTrue (RegistrationPage.email_err.getText().contains("The email field is required."));
        assertTrue (RegistrationPage.pass_err.getText().contains("The password field is required."));

    }
}
