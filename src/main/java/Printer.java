public class Printer {

    //    Create a Printer class that has a property for number of sheets of paper left.
    //    Add a toner volume property to the class.
    private int sheetsOfPaperAvailable = 10000;
    private int tonerVolume = 10000;

    public Printer(){
        this.sheetsOfPaperAvailable = sheetsOfPaperAvailable;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaperAvailable(){
        return this.sheetsOfPaperAvailable;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    //    Add a method to print that takes in a number of pages and number of copies.
    //    The print method will only run if the printer has enough paper.
    //    If it runs it will reduce the value of the paper left by number of copies * number of pages.
    //    Modify the printer so that it reduces the toner by 1 for each page printed.
    public boolean print(int numberOfPages, int numberOfCopies){
        int totalPages = numberOfPages*numberOfCopies;
        if(totalPages <= this.sheetsOfPaperAvailable){
            this.sheetsOfPaperAvailable -= totalPages;
            this.tonerVolume -= totalPages;
            return true;
        };
        return false;
    }

    //    Create a method to refill the printer paper.
    public void refill(int numberOfSheets){
        this.sheetsOfPaperAvailable += numberOfSheets;
    }

}
