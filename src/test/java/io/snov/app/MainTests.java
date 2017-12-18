package io.snov.app;

import com.codeborne.selenide.Condition;
import io.snov.app.Pages.AddProspectPage;
import io.snov.app.Pages.HomePage;
import io.snov.app.Pages.LoginPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTests extends BaseTest {
    @Test
    public void AddNewList() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.AddList();
        HomePage.RemoveList();
    }

    @Test
    public void AddProspectToNewList() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.AddList();
        HomePage.AddNewProspect();
        AddProspectPage.form_title.waitUntil(Condition.appear, 10000);
        AddProspectPage.ProsprctForm("Vasya","Pupkin","Google","https://www.google.com","CEO","test1@test.test");
        AddProspectPage.form_title.waitUntil(Condition.disappear,10000);
        assertTrue (HomePage.prospect_ava.isDisplayed());
    }

    @Test
    public void Add100ProspectsToNewList() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.AddList();
        for (int i = 0; i < 100; i++) {
            String random_value = ""+Math.random();
            HomePage.AddNewProspect();
            AddProspectPage.form_title.waitUntil(Condition.appear, 10000);
            AddProspectPage.ProsprctForm("Vasya"+random_value, "Pupkin"+random_value, "Google", "https://www.google.com", "CEO", "test"+random_value+"@test.test");
            AddProspectPage.form_title.waitUntil(Condition.disappear, 10000);
        }
        assertTrue (HomePage.prospect_ava.isDisplayed());
        HomePage.select_all_checkbox.click();
        assertTrue (HomePage.selected_prospects_count.getText().contains("(100)"));
    }

    @Test
    public void Add10ProspectsToNewList() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.AddList();
        for (int i = 0; i < 10; i++) {
            String random_value = ""+Math.random();
            HomePage.AddNewProspect();
            AddProspectPage.form_title.waitUntil(Condition.appear, 10000);
            AddProspectPage.ProsprctForm("Vasya"+random_value, "Pupkin"+random_value, "Google", "https://www.google.com", "CEO", "test"+random_value+"@test.test");
            AddProspectPage.form_title.waitUntil(Condition.disappear, 10000);
        }
        assertTrue (HomePage.prospect_ava.isDisplayed());
        HomePage.select_all_checkbox.click();
        assertTrue (HomePage.selected_prospects_count.getText().contains("(10)"));
    }

    @Test
    public void RemoveAllProspects() throws Exception {
        LoginPage.LogIn("apanok.jbs@gmail.com", "qweasd123");
        HomePage.RemoveProspects();
        HomePage.select_all_checkbox.waitUntil(Condition.disappear,10000);
        assertTrue(HomePage.select_all_checkbox.is(Condition.disappear));
    }
}
