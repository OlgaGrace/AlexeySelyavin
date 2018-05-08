import org.testng.annotations.Test;

public class GroupModification extends TestBase {
    @Test
    public void testGroupModification(){
        goToGroupPage();
        selectGroup();
        initGroupModification();
        fillGroupForm("new name", "new header", "new footer");
        confirmGroupModification();
        returnToGroupPage();
    }

}
