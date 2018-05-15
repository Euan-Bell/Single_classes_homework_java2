public class Printer {


    private int pagesLeft;
    private int numberOfCopies;


    public Printer( int pagesLeft, int numberOfCopies){
        this.pagesLeft = pagesLeft;
        this.numberOfCopies = numberOfCopies;
    }

    public int numberOfCopies() {
        if (this.pagesLeft <= 0){
            return this.pagesLeft;}
            return this.pagesLeft - this.numberOfCopies;

    }

    public int refillPrinter() {
        if (this.pagesLeft <=0){
            return this.pagesLeft +5;}
            return this.pagesLeft;
    }
}

