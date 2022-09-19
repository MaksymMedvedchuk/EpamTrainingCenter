package chapter4.task19;

import java.util.ArrayList;
import java.util.List;

public class PhotoAlbum {
    private static final int PAGE_QUANTITY = 20;
    List<Page> pageList = new ArrayList<>();
    private Page page;

    public void setPhotoNumber() {
    }

    public void completePhotoAlbum(Photo photo) throws FullAlbumException {
        if (pageList.size() % PAGE_QUANTITY == 0) throw new FullAlbumException("The album is full");

    }

    public void printPhotoQuantity() {
        for (Page page : pageList) {
            System.out.println(page.getPhotoList());
        }
    }
    
    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
}
