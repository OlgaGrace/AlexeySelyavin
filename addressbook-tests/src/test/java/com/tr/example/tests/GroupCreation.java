package com.tr.example.tests;

import com.tr.example.model.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

  @Test
  public void testGroupcreation() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData()
            .withName("name")
            .withHeader("header")
            .withFooter("footer"));
    app.getGroupHelper().submitGroupCreation(By.name("submit"));
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();

    Assert.assertEquals(after, before+1);
  }
  @Test
  public void testGroupcreationLongName() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData());
    app.getGroupHelper().submitGroupCreation(By.name("submit"));
    app.getGroupHelper().returnToGroupPage();

  }

  @Test
  public void testGroupcreationShortName() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData());
    app.getGroupHelper().submitGroupCreation(By.name("submit"));
    app.getGroupHelper().returnToGroupPage();

  }
}
