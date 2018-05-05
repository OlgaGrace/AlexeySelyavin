import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDelete extends TestBase{
@Test
    public void groupDeletionTest(){
    goToGroupPage();
    selectGroup();
    deleteGroup();
    returnToGroupPage();
}

}
