import org.testng.annotations.Test;

public class Groupcreation extends TestBase {

  @Test
  public void testGroupcreation() throws Exception {
    openSiteAddressbook();
    login();
    goToGroupPage();
    initNewGroupCreation();
    fillGroupForm("name1", "header", "footer");
    submitGroupCreation();
    returnToGroupPage();
  }

}
