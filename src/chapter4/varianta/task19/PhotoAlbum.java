package chapter4.varianta.task19;

import java.util.ArrayList;
import java.util.List;

public class PhotoAlbum {
    private static final int PAGE_QUANTITY = 2;
    private List<Page> pageList = new ArrayList<>();

    public void supplementPhotoAlbum(Photo photo) {
        if (isAlbumFull()) throw new FullAlbumException("The album is full");
        if (isNewPageNeeded()) pageList.add(new Page());
        pageList.get(pageList.size() - 1).getPhotoList().add(photo);
    }

    private boolean isNewPageNeeded() {
        return pageList.isEmpty() || pageList.get(pageList.size() - 1).isPageFull();
    }

    private boolean isAlbumFull() {
        return pageList.size() == PAGE_QUANTITY && pageList.get(PAGE_QUANTITY - 1).isPageFull();
    }

    public void printPhotoQuantity() {
        int photoQuantity = 0;
        for (Page page : pageList) {
            photoQuantity += page.getPhotoList().size();
        }
        System.out.println(photoQuantity);
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
}
