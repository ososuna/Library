package classes;

public class Magazine extends Publication {
    
    private String number;

    public Magazine(String code, String title, int year, String number) {
        super(code, title, year);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine [number=" + number + "]";
    }

}
