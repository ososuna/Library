package classes;

public class Book extends Publication implements Loanable {

    private boolean borrowed;

    public Book(String code, String title, int year) {
        super(code, title, year);
        this.borrowed = false;
    }
    
    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public void giveBack() {
        this.borrowed = false;
    }

    @Override
    public void lend() {
        this.borrowed = true;
    }

    @Override
    public String toString() {
        return "\nCode: " + this.code + "\nTitle: " + this.title + "\nYear: " +
                this.year + "\nIs Borrowed: " + this.borrowed;
    }

}
