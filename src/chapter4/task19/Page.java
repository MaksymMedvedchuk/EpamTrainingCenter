package chapter4.task19;

import java.util.ArrayList;
import java.util.List;

public class Page {
    List<Photo> photoPage = new ArrayList<>(); //photoPage це ж в нас як одна сторінка альбому?
    private static final int PAGE_PHOTO_QUANTITY = 2;

    public void addPhoto(Photo photo){
        photoPage.add(photo);
    }

    public boolean isPageFull(){
        return photoPage.size() % PAGE_PHOTO_QUANTITY == 0;
    }

    public List<Photo> getPhotoList() {
        return photoPage;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoPage = photoList;
    }
}

