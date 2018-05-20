package com.tr.example.tests;

import com.tr.example.model.ContactData;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ContactCreation extends TestBase {
    @Test
    public void createContact() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Alexey", "Selyavin", "Israel"));
        app.getContactHelper().confirmContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }
}