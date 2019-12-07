package Codereview3_Wahl;

import java.util.ArrayList;

public class Bike {
    private static int instanceCounter;
    private int bikeID;
    private String color;
    private String state;

    public Bike(String color, String state) {
        instanceCounter++;
        bikeID = instanceCounter;
        this.color = color;
        this.state = state;
    }

    public Bike() {

    }

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
