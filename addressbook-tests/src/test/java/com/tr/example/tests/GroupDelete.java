package com.tr.example.tests;

import org.testng.annotations.Test;

public class GroupDelete extends TestBase {
    @Test
    public void groupDeletionTest() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
