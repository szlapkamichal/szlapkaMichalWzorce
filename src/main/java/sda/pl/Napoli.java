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

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
}
