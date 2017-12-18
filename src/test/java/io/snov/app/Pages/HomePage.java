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
                                  help_modal_remember = $(By.name("remember")),
                                  add_list_btn = $(By.xpath("//*[@id=\"sidebarInner\"]/div[1]/a/b")),
                                  add_list_modal_listname = $(By.xpath("//*[@id=\"form-add-list\"]/div[1]/input")),
                                  add_list_modal_submit_btn = $(By.xpath("//*[@id=\"form-add-list\"]//button")),
                                  remove_list_btn = $(By.cssSelector("button.btn:nth-child(7)")),
                                  remove_modal_ok_btn = $(By.xpath("//*[@class=\"swal2-buttonswrapper\"]/button[1]")),
                                  remove_modal_cancel_btn = $(By.xpath("//*[@class=\"swal2-buttonswrapper\"]/button[2]")),
                                  add_prospect_btn = $(By.cssSelector("a.nav-link:nth-child(3)")),
                                  prospect_ava = $(By.cssSelector(".contact-avatar")),
                                  list_all = $(By.xpath("//*[@id=\"sidebarInner\"]/ul[2]/li[1]/a")),
                                  select_all_checkbox = $(By.name("itemsAll")),
                                  remove_all_btn = $(By.xpath("//*[@id=\"app-layout\"]//table//button[1]")),
                                  remove_dialog_ok = $(By.xpath("//*[@id=\"app-layout\"]//div[10]/button[1]")),
                                  remove_dialog_cancel = $(By.xpath("//*[@id=\"app-layout\"]//div[10]/button[2]")),
                                  selected_prospects_count = $(By.id("selectedCounter")),
                                  empty_all_list_alert = $(By.xpath("//*[@id=\"app-layout\"]/div[2]/div/div/div[5]/ul"));


    public static void OpenUserDropdown() {
        CloseHelpModal();
        user_ava.click();
        user_dropdown.waitUntil(Condition.visible,10000);
    }

    public static void ClickLogout() {
        logout.click();
    }

    public static void AddList() {
        CloseHelpModal();
        add_list_btn.click();
        //it is convenient to use default list names
        // add_list_modal_listname.setValue("NewList");
        add_list_modal_submit_btn.click();
    }

    private static void CloseHelpModal() {
        if (help_modal_close.isDisplayed()) {
            help_modal_remember.click();
            help_modal_close.click();
        }
    }

    public static void RemoveList() {
        CloseHelpModal();
        remove_list_btn.click();
        remove_modal_ok_btn.click();
        user_ava.waitUntil(Condition.visible, 10000);
    }

    public static void AddNewProspect() {
        CloseHelpModal();
        add_prospect_btn.click();


    }

    public static void RemoveProspects() {
        CloseHelpModal();
        list_all.click();
        select_all_checkbox.waitUntil(Condition.appear, 10000);
        select_all_checkbox.click();
        remove_all_btn.click();
        remove_dialog_ok.click();

    }
}
