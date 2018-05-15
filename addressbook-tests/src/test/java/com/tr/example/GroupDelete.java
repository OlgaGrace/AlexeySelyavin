package com.tr.example;

import org.testng.annotations.Test;

public class GroupDelete extends TestBase {
    @Test
    public void groupDeletionTest() {
        app.goToGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
    }

}
