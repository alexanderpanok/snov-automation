package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    public static SelenideElement   email = $(By.name("email")),
                                     pass = $(By.name("password")),
                                     remember = $(By.name("remember")),
                                     submit_btn = $(By.xpath("//*[@id=\"app-layout\"]//button")),
                                     link_to_restore_pass = $(By.xpath("//*[@id=\"app-layout\"]//a[1]")),
                                     link_to_sign_up = $(By.xpath("//*[@id=\"app-layout\"]/div[2]/p/a")),
                                     err_msg_email = $(By.xpath("//*[@id=\"app-layout\"]//span/strong")),
                                     err_msg_pass = $(By.xpath("//*[@id=\"app-layout\"]/div[2]//div[2]/span/strong"));

    public static void LogIn(String email_val, String password) {
        email.setValue(email_val);
        pass.setValue(password);
        submit_btn.click();

    }

}
