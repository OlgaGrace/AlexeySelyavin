package com.tr.example.model;

public class ContactData {
    private final String fName;
    private final String lName;
    private final String address;

    public ContactData(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }
}
