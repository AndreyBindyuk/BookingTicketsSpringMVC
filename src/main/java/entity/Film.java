package entity;

import java.util.List;
import java.util.Set;

public class Film {
    private String title;
    private int duration;
    private double filmRating;
    private String description;
    private String year;
    private String country;
    private int restriction;
    private Set<Actor> actors;
    private Set<Genre> genres;
    private String hallName;
    private List<Ticket> tickets;

    public Film() {
    }

    public Film(String title, int duration, double filmRating, String description, String year, String country, int restriction, Set<Actor> actors, Set<Genre> genres) {
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

    public Film(String title, int duration, double filmRating, String description, String year, String country, int restriction, Set<Actor> actors, Set<Genre> genres, String hallName, List<Ticket> tickets) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
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
