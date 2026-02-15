public class Magazine extends LibraryItem {
    private int issueNumber;
    public Magazine(String title, String id, int issueNumber){
        super(title, id);
        this.issueNumber = issueNumber;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Magazine || Issue Number: " + issueNumber);
    }

}
