package com.tr.example;

import org.testng.annotations.Test;
import org.testng.Assert;

public class ContactCreation extends TestBase {
    @Test
    public void createContact() {
        int before = app.getContactCount();
        app.initContactCreation();
        app.fillContactForm(new ContactData("Alexey", "Selyavin", "Israel"));
        app.confirmContactCreation();
        int after = app.getContactCount();
        Assert.assertEquals(after,before+1);
    }
}
