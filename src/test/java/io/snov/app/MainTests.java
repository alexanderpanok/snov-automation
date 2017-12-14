package io.snov.app;

import io.snov.app.Pages.HomePage;
import io.snov.app.Pages.LoginPage;
import org.junit.Test;

public class MainTests extends BaseTest {
    @Test
    public void AddNewList() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.AddList();
    }
}
