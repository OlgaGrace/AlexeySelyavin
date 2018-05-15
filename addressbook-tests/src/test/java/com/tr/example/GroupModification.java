package com.tr.example;

import org.testng.annotations.Test;

public class GroupModification extends TestBase {
    @Test
    public void testGroupModification(){
        app.goToGroupPage();
        app.selectGroup();
        app.initGroupModification();
        app.fillGroupForm(new GroupData("new name", "new header", "new footer"));
        app.confirmGroupModification();
        app.returnToGroupPage();
    }

}
