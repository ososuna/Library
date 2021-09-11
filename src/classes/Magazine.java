package classes;

public class Magazine extends Publication {
    
    private int number;

    public Magazine(String code, String title, int year, int number) {
        super(code, title, year);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nCode: " + this.code + "\nTitle: " + this.title + "\nYear: " +
                this.year + "\nNumber: " + this.number;
    }

}
