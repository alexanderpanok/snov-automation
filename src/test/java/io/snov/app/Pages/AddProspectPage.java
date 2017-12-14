package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddProspectPage extends HomePage {
    public static SelenideElement form_title = $(By.xpath("//*[@id=\"app-layout\"]/div[2]/div[1]/div/h3")),
                                  first_name = $(By.name("firstName"));
}
