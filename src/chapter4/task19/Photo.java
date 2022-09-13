package chapter4.task19;

public class Photo {
    private String namePhoto;

    public Photo(String namePhoto) {
        setNamePhoto(namePhoto);
    }

    public String getNamePhoto() {
        return namePhoto;
    }

    public void setNamePhoto(String namePhoto) {
        this.namePhoto = namePhoto;
    }

    @Override
    public String toString() {
        return namePhoto;
    }
}
