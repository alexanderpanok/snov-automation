package io.snov.app;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    String BaseUrl = "https://app.snov.io/";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open(BaseUrl);
    }

    @After
    public void tearDown() throws Exception {
        close();
    }
}
