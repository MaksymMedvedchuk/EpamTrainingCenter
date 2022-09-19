package chapter4.task19;

public class Photo {
    private String photoName;

    public Photo(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Override
    public String toString() {
        return photoName;
    }
}


