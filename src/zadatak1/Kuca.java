package zadatak1;

public class Kuca extends Nekretnina {

    private double povrsinaOkucnice;
    private double cena;

    @Override
    public double izracunajCenu() {

        if(getZona() == 1){

            cena = (getKvadratura() * 3000) + (getPovrsinaOkucnice() * getZona() * 0.15);

        }
        if(getZona() == 2){

            cena = (getKvadratura() * 2000) + (getPovrsinaOkucnice() * getZona() * 0.15);

        }
        if(getZona() == 3){

            cena = (getKvadratura() * 1000) + (getPovrsinaOkucnice() * getZona() * 0.15);

        }
        if(getZona() == 4){

            cena = (getKvadratura() * 500) + (getPovrsinaOkucnice() * getZona() * 0.15);

        }
        return cena;
    }

    public Kuca() {
    }

    public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    public double getPovrsinaOkucnice() {
        return povrsinaOkucnice;
    }

    public void setPovrsinaOkucnice(double povrsinaOkucnice) {
        this.povrsinaOkucnice = povrsinaOkucnice;
    }
    //i overrode the whole toString() method for Kuca
    @Override
    public String toString() {
        return "Kuca se nalazi na adresi " + getAdresa() + " i velicine je " + getKvadratura() + " kvm. Nalazi se u " + getZona() + "-oj zoni. Povrsina okucnice je " + getPovrsinaOkucnice() + " kvm. Cena kuce iznosi " + izracunajCenu() + " EUR. Podaci o vlasniku: " + getVlasnik() + ".";
    }
}
