package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "FILMS")
public class Film implements Serializable {
    @Id
    @Column(name = "TITLE",nullable = false,length = 100)
    private String title;

    @Column(name = "DURATION",nullable = false,length = 11)
    private int duration;

    @Column(name = "FILMRATING",nullable = false,length = 11)
    private double filmRating;

    @Column(name = "DESCRIPTION",nullable = false,length = 100)
    private String description;

    @Column(name = "YEAR",nullable = false,length = 11)
    private int year;

    @Column(name = "COUNTRY",nullable = false,length = 100)
    private String country;

    @Column(name = "RESTRICTION",nullable = false,length = 11)
    private int restriction;

    @Column(name = "ACTORS",nullable = false,length = 100)
    private String actors;

    @Column(name = "GENRES",nullable = false,length = 100)
    private String genres;
//    private String hallName;
//    private List<Ticket> tickets;

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

//    public Film(String title, int duration, double filmRating, String description, int year, String country, int restriction, String actors, String genres, String hallName, List<Ticket> tickets) {
//        this.title = title;
//        this.duration = duration;
//        this.filmRating = filmRating;
//        this.description = description;
//        this.year = year;
//        this.country = country;
//        this.restriction = restriction;
//        this.actors = actors;
//        this.genres = genres;
//        this.hallName = hallName;
//        this.tickets = tickets;
//    }

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
//
//    public String getHallName() {
//        return hallName;
//    }
//
//    public void setHallName(String hallName) {
//        this.hallName = hallName;
//    }
//
//    public List<Ticket> getTickets() {
//        return tickets;
//    }
//
//    public void setTickets(List<Ticket> tickets) {
//        this.tickets = tickets;
//    }

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
