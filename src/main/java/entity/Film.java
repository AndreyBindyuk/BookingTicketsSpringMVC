package entity;

import java.util.List;

public class Film {
    private String title;
    private int duration;
    private double filmRating;
    private String description;
    private int year;
    private String country;
    private int restriction;
    private String actors;
    private String genres;
    private String hallName;
    private List<Ticket> tickets;

    public Film() {
    }

    public Film(String title, int duration, double filmRating, String description, int year, String country, int restriction, String actors, String genres) {
        this.title = title;
        this.duration = duration;
        this.filmRating = filmRating;
        this.description = description;
        this.year = year;
        this.country = country;
        this.restriction = restriction;
        this.actors = actors;
        this.genres = genres;
    }

    public Film(String title, int duration, double filmRating, String description, int year, String country, int restriction, String actors, String genres, String hallName, List<Ticket> tickets) {
        this.title = title;
        this.duration = duration;
        this.filmRating = filmRating;
        this.description = description;
        this.year = year;
        this.country = country;
        this.restriction = restriction;
        this.actors = actors;
        this.genres = genres;
        this.hallName = hallName;
        this.tickets = tickets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(double filmRating) {
        this.filmRating = filmRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRestriction() {
        return restriction;
    }

    public void setRestriction(int restriction) {
        this.restriction = restriction;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Film{" +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", filmRating=" + filmRating +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                ", restriction=" + restriction +
                ", actors=" + actors +
                ", genres=" + genres +
                '}';
    }
}
