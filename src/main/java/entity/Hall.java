package entity;


public class Hall {
    private String hallName;
    private int seatsAmount;
    private String filmTitle;
    private boolean isOverloaded;

    public Hall() {
    }

    public Hall(String hallName, int seatsAmount) {
        this.hallName = hallName;
        this.seatsAmount = seatsAmount;
    }

    public Hall(String hallName, int seatsAmount, String filmTitle, boolean isOverloaded) {
        this.hallName = hallName;
        this.seatsAmount = seatsAmount;
        this.filmTitle = filmTitle;
        this.isOverloaded = isOverloaded;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public boolean isOverloaded() {
        return isOverloaded;
    }

    public void setOverloaded(boolean overloaded) {
        isOverloaded = overloaded;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallName='" + hallName + '\'' +
                ", seatsAmount=" + seatsAmount +
                '}';
    }
}
