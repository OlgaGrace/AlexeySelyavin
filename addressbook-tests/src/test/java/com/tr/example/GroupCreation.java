package com.tr.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

  @Test(priority = 3)
  public void testGroupcreation() {
    app.goToGroupPage();
    int before = app.getGroupCount();
    app.initNewGroupCreation();
    app.fillGroupForm(new GroupData("name1", "header", "footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    int after = app.getGroupCount();

    Assert.assertEquals(after, before+1);
  }
  @Test(priority = 2)
  public void testGroupcreationLongName() {
    app.goToGroupPage();
    app.initNewGroupCreation();
    app.fillGroupForm(new GroupData("name1111111111", "header111111", "footer1111111"));
    app.submitGroupCreation();
    app.returnToGroupPage();

  }
  @Test(priority = 1)
  public void testGroupcreationShortName() {
    app.goToGroupPage();
    app.initNewGroupCreation();
    app.fillGroupForm(new GroupData("n", "h", "f"));
    app.submitGroupCreation();
    app.returnToGroupPage();

  }
}
