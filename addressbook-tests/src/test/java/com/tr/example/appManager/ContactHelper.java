package com.tr.example.appManager;

import com.tr.example.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    public WebDriver driver;

    public ContactHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void initContactCreation() {
        driver.findElement(By.xpath("//a[@href='edit.php']")).click();
    }

    public void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getfName());

        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getlName());

        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());


    }

    public void confirmContactCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public int getContactCount() {
        return driver.findElements(By.name("selected[]")).size();
    }
}
