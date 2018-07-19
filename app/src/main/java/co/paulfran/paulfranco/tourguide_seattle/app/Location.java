package co.paulfran.paulfranco.tourguide_seattle.app;

public class Location {
    private String name;
    private String details;
    private int imageId;
    private static final int NO_IMAGE = -1;


    public Location(String name, int image, String details) {
        this.name = name;
        this.details = details;
        imageId = image;
    }

    public String getName() {
        return name;
    }


    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }

    public String getDetails() {
        return details;
    }
}
