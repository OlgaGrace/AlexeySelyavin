import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

  @Test(priority = 3)
  public void testGroupcreation() {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("name1", "header", "footer");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 3 passed");
  }
  @Test(priority = 2)
  public void testGroupcreationLongName() {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("name1111111111", "header111111", "footer1111111");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 2 passed");

  }
  @Test(priority = 1)
  public void testGroupcreationShortName() {
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("n", "h", "f");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("Test 1 passed");

  }
}
