import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

  @Test(priority = 3)
  public void testGroupcreation() throws Exception {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("name1", "header", "footer");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 3 passed");
  }
  @Test(priority = 2)
  public void testGroupcreationLongName() throws Exception {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("name1111111111", "header111111", "footer1111111");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 2 passed");

  }
  @Test(priority = 1)
  public void testGroupcreationShortName() throws Exception {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("n", "h", "f");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 1 passed");

  }
}
