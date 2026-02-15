public class App {
    public static void main(String[] args) throws Exception {
        Book myBook = new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald");
        Magazine myMagazine = new Magazine("National Geographic", "M001", 202);
            Book myBook2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee");
                System.out.println("---Library Items Information:---");
                    myBook.displayInfo();
                    System.out.println();
                    myMagazine.displayInfo();
                    myBook2.displayInfo();
                    System.out.println("\nTotal Library Items: " + LibraryItem.totalItems);
    }
}
