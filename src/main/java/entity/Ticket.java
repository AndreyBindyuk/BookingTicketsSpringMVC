package entity;

public class Ticket {
    private String hallName;
    private int seat;
    private int price;
    private String filmTitle;
    private boolean isBooked;

    public Ticket() {
    }

//    public Ticket(String hallName, int seat, int price, String filmTitle) {
//        this.hallName = hallName;
//        this.seat = seat;
//        this.price = price;
//        this.filmTitle = filmTitle;
//    }

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
