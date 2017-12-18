package io.snov.app;

import com.codeborne.selenide.Condition;
import io.snov.app.Pages.HomePage;
import io.snov.app.Pages.LoginPage;
import org.junit.Test;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertTrue;

public class LoginTests extends BaseTest {
    @Test
    public void SuccessLoginTest() throws Exception {
        open(BaseUrl);
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        assertTrue(HomePage.user_ava.isDisplayed());

    }

    @Test
    public void TestLogOut() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.OpenUserDropdown();
        HomePage.ClickLogout();
        assertTrue(LoginPage.logo.isDisplayed());
    }

    @Test
    public void FailLoginEmptyFields() throws Exception {
        LoginPage.LogIn("", "");
        LoginPage.err_msg_email.waitUntil(visible, 10000);
        LoginPage.err_msg_pass.waitUntil(visible, 10000);
        assertTrue (LoginPage.err_msg_email.getText().contains("The email field is required."));
        assertTrue (LoginPage.err_msg_pass.getText().contains("The password field is required."));
    }

    @Test
    public void FailLoginEmptyPass() throws Exception {
        LoginPage.LogIn("test@test.test", "");
        LoginPage.err_msg_pass.waitUntil(visible, 10000);
        assertTrue (LoginPage.err_msg_pass.getText().contains("The password field is required."));
    }

    @Test
    public void FailLoginEmptyEmail() throws Exception {
        LoginPage.LogIn("", "qweasd123");
        LoginPage.err_msg_email.waitUntil(visible, 10000);
        assertTrue (LoginPage.err_msg_email.getText().contains("The email field is required."));
    }

    @Test
    public void FailLoginInvalidCredentials() throws Exception {
        LoginPage.LogIn("test@test.test", "qweasd123");
        LoginPage.err_msg_pass.waitUntil(visible, 10000);
        assertTrue (LoginPage.err_msg_pass.getText().contains("Invalid Email Address or Password"));
    }
    
}

