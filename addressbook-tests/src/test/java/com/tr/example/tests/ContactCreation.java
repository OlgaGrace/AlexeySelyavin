package com.tr.example.tests;

import com.tr.example.model.ContactData;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ContactCreation extends TestBase {
    @Test
    public void createContact() {
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData()
                .withfName("Alex")
                .withlName("Selyavin")
                .withAddress("nhevgevgev@gmail.com"));
        app.getContactHelper().confirmContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }
}
