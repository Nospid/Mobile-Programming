package com.dk.listviewexample;

public class Club {

    private String name;

    private String type;

    private String address;

    private int entryFree;

    public Club(){

    }

    public Club(String name, String type, String address, int entryFree) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.entryFree = entryFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEntryFree() {
        return entryFree;
    }

    public void setEntryFree(int entryFree) {
        this.entryFree = entryFree;
    }
}
