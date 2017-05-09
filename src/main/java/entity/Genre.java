package entity;

public class Genre {
    private String title;

    public Genre(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "title='" + title + '\'' +
                '}';
    }
}
