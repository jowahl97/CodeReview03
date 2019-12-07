package Codereview3_Wahl;

public class User {
    private static int instanceCounter;
    private int userID;
    private String name;
    private String surName;
    private Bike currentlyRentedBike;

    public User(String name, String surName) {
        instanceCounter++;
        userID = instanceCounter;
        this.name = name;
        this.surName = surName;
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Bike getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void setCurrentlyRentedBike(Bike currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }

}
