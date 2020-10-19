package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS,
    OLDER_KIDS,
    TEENS,
    MATURE;

    private int minimumAge;

    public int getMinimumAge() {
        return minimumAge;
    }



}
