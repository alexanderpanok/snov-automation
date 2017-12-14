package io.snov.app.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static SelenideElement user_ava = $(By.className("user-dropdown-avatar")),
                                  user_dropdown = $(By.className("dropdown-header")),
                                  logout = $(By.xpath("//*[@id=\"top\"]/div/nav/ul[2]/li/ul/li[6]/a")),
                                  help_modal_close = $(By.xpath("//*[@id=\"emptyList\"]/div/div/div[1]/button/span")),
                                  add_list_btn = $(By.xpath("//*[@id=\"sidebarInner\"]/div[1]/a/b")),
                                  add_list_modal_listname = $(By.xpath("//*[@id=\"form-add-list\"]/div[1]/input")),
                                  add_list_modal_submit_btn = $(By.xpath("//*[@id=\"form-add-list\"]//button"))  ;

    public static void OpenUserDropdown() {
        help_modal_close.click();
        user_ava.click();
        user_dropdown.waitUntil(Condition.visible,10000);
    }

    public static void ClickLogout() {
        logout.click();
    }

    public static void AddList() {
        if (help_modal_close.isDisplayed()) {
            help_modal_close.click();
        }
        add_list_btn.click();
       // add_list_modal_listname.setValue("NewList");
        add_list_modal_submit_btn.click();
    }



}
