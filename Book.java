public class Book extends LibraryItem {
    private String author;
    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }
    @Override
        public void displayInfo(){
            super.displayInfo();
        System.out.println("Type: Book || Author: " + author);
        }
}
