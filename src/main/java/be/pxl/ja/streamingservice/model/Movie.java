package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends be.pxl.ja.opdracht1.Content implements be.pxl.ja.opdracht1.Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, be.pxl.ja.opdracht1.Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        int hours = duration / 60;
        int minutes = duration % 60;
        StringBuilder result = new StringBuilder();
        if (hours > 0) {
            result.append(hours).append(" u ");
        }
        if (minutes > 0) {
            result.append(minutes).append(" min");
        }
        return result.toString().trim();
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear()).append(")");
        }
        return builder.toString();
    }
}
