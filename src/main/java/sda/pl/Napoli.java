package sda.pl;

public class Napoli extends Pizza {
    private double cena;
    private double waga;


    @Override
    public String description() {
        return null;
    }


    public Napoli(double cena, double waga) {
        this.cena = cena;
        this.waga = waga;
    }
}
