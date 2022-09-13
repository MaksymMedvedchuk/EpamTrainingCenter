package chapter4.task19;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Photo photo1 = new Photo("Photo 1");
        Photo photo2 = new Photo("Photo 2");
        Photo photo3 = new Photo("Photo 3");
        List<Photo> photoList = new ArrayList<>();
        photoList.add(photo1);
        photoList.add(photo2);
        photoList.add(photo3);

        PhotoAlbum photoAlbum = new PhotoAlbum(photoList);
        System.out.println(photoAlbum);
    }
}
