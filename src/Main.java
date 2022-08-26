public class Main {
    public static void main(String[] args) {
        SimpleReader readerIvanov = new SimpleReader();
        SimpleReader readerPetrov = new SimpleReader();
        LibraryAdministrator sidorov = new LibraryAdministrator();

        readerIvanov.getBooks();
        readerPetrov.returnBooks();
        sidorov.notifyDelay();
    }

}