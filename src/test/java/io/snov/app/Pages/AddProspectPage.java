package io.snov.app.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddProspectPage extends HomePage {
    public static SelenideElement form_title = $(By.xpath("//*[@id=\"app-layout\"]/div[2]/div[1]/div/h3")),
                                  first_name = $(By.name("firstName")),
                                  last_name = $(By.name("lastName")),
                                  company_name_field = $(By.name("companyName")),
                                  website_field = $(By.name("companyWebsite")),
                                  position_field = $(By.name("position")),
                                  email_address = $(By.name("email")),
                                  submit_btn = $(By.xpath("//*[@id=\"app-layout\"]/div[2]/div[1]/div/form/div[8]/button")),
                                  list_select = $(By.name("listId"));

    public static void ProsprctForm(String fname,String lname,String company_name,String website,String position,String email_addr) {
        first_name.setValue(fname);
        last_name.setValue(lname);
        company_name_field.setValue(company_name);
        website_field.setValue(website);
        position_field.setValue(position);
        email_address.setValue(email_addr);
        submit_btn.click();
    }

}
