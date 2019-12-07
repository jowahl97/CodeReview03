package Codereview3_Wahl;

import java.util.Date;

public class Rent {
    private Bike bike;
    private Date startDate;
    private Date endDate;
    private User user;

    public Rent(Bike bike, Date startDate, User user) {
        this.bike = bike;
        this.startDate = startDate;
        this.user = user;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
