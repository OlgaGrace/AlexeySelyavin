package com.tr.example.model;

public class ContactData {
    private String fName;
    private String lName;
    private String address;


    public ContactData withfName(String fName) {
        this.fName = fName;
        return this;
    }

    public ContactData withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
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
