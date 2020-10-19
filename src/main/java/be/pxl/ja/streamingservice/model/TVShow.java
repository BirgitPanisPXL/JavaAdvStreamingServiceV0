package be.pxl.ja.streamingservice.model;

public final class TVShow extends be.pxl.ja.opdracht1.Content {
    private int numberOfSeasons;

    public TVShow(String title, Rating maturityRating, int numberOfSeasons) {
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
