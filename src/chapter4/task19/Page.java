package chapter4.task19;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<Photo> photoPage = new ArrayList<>();
    private static final int PAGE_PHOTO_CAPACITY = 2;

    public void addPhoto(Photo photo){
        photoPage.add(photo);
    }

    public boolean isPageFull(){
        return photoPage.size() == PAGE_PHOTO_CAPACITY;
    }

    public List<Photo> getPhotoList() {
        return photoPage;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoPage = photoList;
    }


}

