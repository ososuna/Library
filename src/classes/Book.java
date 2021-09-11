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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void lend() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "Book [borrowed=" + borrowed + "]";
    }

}
