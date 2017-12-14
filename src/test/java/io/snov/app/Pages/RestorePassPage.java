package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RestorePassPage extends BasePage {

    public static SelenideElement restore_email = $(By.name("email")),
                                  submit_btn = $(By.xpath("//*[@id=\"app-layout\"]//button")),
                                  succes_restore = $(By.cssSelector(".panel-body")),
                                  err_msg = $(By.xpath("//*[@id=\"app-layout\"]//span/strong"));

    public static void RestorePass(String email) {
       restore_email.setValue(email);
       submit_btn.click();
    }
}
