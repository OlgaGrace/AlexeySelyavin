package com.tr.example.tests;

import com.tr.example.model.GroupData;
import org.testng.annotations.Test;

public class GroupModification extends TestBase {
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("new name", "new header", "new footer"));
        app.getGroupHelper().confirmGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
