package sda.pl;

public class AglioOlio extends Pasta{
    private double cena;
    private double waga;


    @Override
    public String description() {
        return null;
    }

    public AglioOlio(double cena, double waga) {
        this.cena = cena;
        this.waga = waga;
    }
}
