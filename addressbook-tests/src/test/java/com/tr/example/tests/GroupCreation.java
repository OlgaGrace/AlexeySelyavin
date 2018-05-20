package com.tr.example.tests;

import com.tr.example.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

  @Test(priority = 3)
  public void testGroupcreation() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name1", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();

    Assert.assertEquals(after, before+1);
  }
  @Test(priority = 2)
  public void testGroupcreationLongName() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name1111111111", "header111111", "footer1111111"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();

  }

  @Test(priority = 1)
  public void testGroupcreationShortName() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("n", "h", "f"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();

  }
}
