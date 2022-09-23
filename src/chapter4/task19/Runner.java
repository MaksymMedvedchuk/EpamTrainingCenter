package chapter4.task19;

public class Runner {
    public static void main(String[] args) {
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.supplementPhotoAlbum(new Photo("Photo_1"));
        photoAlbum.supplementPhotoAlbum(new Photo("Photo_2"));
        photoAlbum.supplementPhotoAlbum(new Photo("Photo_3"));
        photoAlbum.supplementPhotoAlbum(new Photo("Photo_4"));
        //photoAlbum.supplementPhotoAlbum(new Photo("Photo_5"));
        System.out.println(photoAlbum.getPageList().size());
        photoAlbum.printPhotoQuantity();
    }
}
