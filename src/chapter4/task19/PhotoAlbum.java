package chapter4.task19;

import java.util.ArrayList;
import java.util.List;

public class PhotoAlbum {
    List<Photo> photoList = new ArrayList<>();
    private Page page;

    public PhotoAlbum(List<Photo> photoList) {
        this.photoList = photoList;
    }

    public void addPhoto(Photo photo){
        photoList.add(photo);
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }

    @Override
    public String toString() {
        List<Photo> list = new ArrayList<>(photoList);
        return list.toString();
    }
}
