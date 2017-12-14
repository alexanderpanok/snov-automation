package io.snov.app;

import io.snov.app.Pages.LoginPage;
import io.snov.app.Pages.RestorePassPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RestoreTests extends BaseTest {
    @Test
    public void SucsessRestore() throws Exception {
        LoginPage.link_to_restore_pass.click();
        RestorePassPage.RestorePass("apanok.jbs@gmail.com");
        assertTrue(RestorePassPage.succes_restore.getText().contains("Email with restore password link was sent to your email address"));
    }

    @Test
    public void FeilRestoreEmptyFields() throws Exception {
        LoginPage.link_to_restore_pass.click();
        RestorePassPage.RestorePass("");
        assertTrue(RestorePassPage.err_msg.getText().contains("The email field is required."));

    }

    @Test
    public void FeilRestoreInvalidEmail() throws Exception {
        LoginPage.link_to_restore_pass.click();
        RestorePassPage.RestorePass("test@test.test");
        assertTrue(RestorePassPage.err_msg.getText().contains("The selected email is invalid."));
    }
}
