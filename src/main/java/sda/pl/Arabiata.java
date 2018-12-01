package sda.pl;

public class Arabiata extends Pasta {
    private double cena;
    private double waga;


    @Override
    public String description() {
        return null;
    }

    public Arabiata(double cena, double waga) {
        this.cena = cena;
        this.waga = waga;
    }
}
