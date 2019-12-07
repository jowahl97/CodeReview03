package Codereview3_Wahl;

import java.util.ArrayList;
import java.util.Date;

public class Station {
    private static int instanceCounter;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikes;
    private static final int maxCount = 5;

    public Station(String location) {
        instanceCounter++;
        stationID = instanceCounter;
        this.location = location;
        bikes = new ArrayList<>();
    }

    public int getStationID() {

        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public void addBike(Bike bike) {
        if(bikes.size() < maxCount) {
            bikes.add(bike);
        } else {
            System.out.println("There are 5 bikes in the station, you cant add more.");
        }
    }

    public Rent rentABike(User user) {
        if(bikes.size() == 0) {
            System.out.println("There are no bikes in this station.");
        } else if(user.getCurrentlyRentedBike() != null) {
            System.out.println("The user rented a bike.");
        } else {
            user.setCurrentlyRentedBike(bikes.get(0));
            bikes.remove(0);
        }
        return new Rent(bikes.get(0), new Date(), user);
    }

    public Rent getABikeBack(Rent rent) {
        if(bikes.size() < maxCount) {
            System.out.println("There are five bikes in the station, you cant give more back.");
        } else if(rent.getUser().getCurrentlyRentedBike() == null) {
            System.out.println("You have no bike to give it back.");
        } else {
            bikes.add(rent.getUser().getCurrentlyRentedBike());
            System.out.println("Bike is given back from the user.");
            rent.getUser().setCurrentlyRentedBike(null);
        }
        rent.setEndDate(new Date());
        return rent;
    }

    private boolean reachedMaxCount() {
        if(bikes.size() < maxCount) {
            System.out.println("There are five bikes in the station, you cant give more back.");
            return false;
        }
        return true;
    }

}
