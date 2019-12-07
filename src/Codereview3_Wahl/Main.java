package Codereview3_Wahl;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Bike> bikeHashMap = new HashMap<Integer, Bike>();
        Bike bike1 = new Bike("blue", "CanBeRented");
        bikeHashMap.put(bike1.getBikeID(), bike1);
        Bike bike2 = new Bike("red", "CanNotBeRented");
        bikeHashMap.put(bike2.getBikeID(), bike2);
        Bike bike3 = new Bike("green", "InService");
        bikeHashMap.put(bike3.getBikeID(), bike3);
        Bike bike4 = new Bike("violet", "Discarded");
        bikeHashMap.put(bike4.getBikeID(), bike4);
        Bike bike5 = new Bike("orange", "Discarded");
        bikeHashMap.put(bike5.getBikeID(), bike5);
        Bike bike6 = new Bike("pink", "InService");
        bikeHashMap.put(bike6.getBikeID(), bike6);
        Bike bike7 = new Bike("black", "CanNotBeRented");
        bikeHashMap.put(bike7.getBikeID(), bike7);
        Bike bike8 = new Bike("yellow", "CanBeRented");
        bikeHashMap.put(bike8.getBikeID(), bike8);

        Station stationWien1 = new Station("Wien 1. Bezirk");
        Station stationWien2 = new Station("Wien 2. Bezirk");
        Station stationWien3 = new Station("Wien 3. Bezirk");

        HashMap<Integer, Station> stationHashMap = new HashMap<>();
        stationHashMap.put(stationWien1.getStationID(),stationWien1);
        stationHashMap.put(stationWien2.getStationID(), stationWien2);
        stationHashMap.put(stationWien3.getStationID(), stationWien3);

        stationWien1.addBike(bike1);
        stationWien1.addBike(bike2);
        stationWien1.addBike(bike3);
        stationWien2.addBike(bike4);
        stationWien2.addBike(bike5);
        stationWien2.addBike(bike6);
        stationWien2.addBike(bike7);

        User user1 = new User("Johannes", "Wahl");
        User user2 = new User("Max", "Mustermann");
        User user3 = new User("Alex", "Musterfrau");
        User user4 = new User("Hannes", "Wal");

        Rent rent = stationWien1.rentABike(user1);
        stationWien2.getABikeBack(rent);

        System.out.println(stationWien1);
        System.out.println(user1.getCurrentlyRentedBike());







    }
}
