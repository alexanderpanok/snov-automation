package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public static SelenideElement logo = $(By.className("brand-img"));
}
