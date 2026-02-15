public class LibraryItem {
    public static int totalItems=0;
    protected String title;
    protected String id;

        public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        totalItems++;
        }
            public void displayInfo(){
        System.out.println("Title: " + title + ";"+"ID: " + id);
            }
} 
