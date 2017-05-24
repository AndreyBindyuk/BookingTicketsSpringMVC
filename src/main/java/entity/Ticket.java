package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TICKETS")
public class Ticket {
    @Id
    @Column(name = "SEAT",unique = true,nullable = false)
    private int seat;

    @Column(name = "HALLNAME",length = 100,nullable = false)
    private String hallName;

    @Column(name = "PRICE",length = 11,nullable = false)
    private int price;

    @Column(name = "FILMTITLE",length = 100, nullable = false)
    private String filmTitle;

    @Column(name = "ISBOOKED",nullable = false)
    private boolean isBooked;

    public Ticket() {
    }

    public Ticket(String hallName, int seat, int price, String filmTitle, boolean isBooked) {
        this.hallName = hallName;
        this.seat = seat;
        this.price = price;
        this.filmTitle = filmTitle;
        this.isBooked = isBooked;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                ", hallName='" + hallName + '\'' +
                ", seat=" + seat +
                ", price=" + price +
                ", filmTitle='" + filmTitle + '\'' +
                '}';
    }
}
