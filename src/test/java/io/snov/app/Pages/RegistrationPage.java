package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends BasePage {
    public static SelenideElement title = $(By.xpath("//*[@id=\"app-layout\"]//h3")),
                                  name_field = $(By.name("name")),
                                  email_field = $(By.name("email")),
                                  pass_field = $(By.name("password")),
                                  pass_confirm_field = $(By.name("password_confirmation")),
                                  submit_btn = $(By.xpath("//*[@id=\"app-layout\"]//button")),
                                  link_to_login = $(By.xpath("//*[@id=\"app-layout\"]//a[3]")),
                                  name_err = $(By.xpath("//*[@id=\"app-layout\"]//div[1]/span/strong")),
                                  email_err = $(By.xpath("//*[@id=\"app-layout\"]//div[2]/span/strong")),
                                  pass_err = $(By.xpath("//*[@id=\"app-layout\"]//div[3]/span/strong")),
                                  cofirmation_info_msg = $(By.xpath("//div[2]//span"));

    public static void Register(String user_name,
                         String user_email,
                         String user_pass,
                         String user_passconfirm) {
        name_field.setValue(user_name);
        email_field.setValue(user_email);
        pass_field.setValue(user_pass);
        pass_confirm_field.setValue(user_passconfirm);
        submit_btn.click();


    }
}
