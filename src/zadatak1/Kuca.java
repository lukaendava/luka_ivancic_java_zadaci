package zadatak1;

public class Kuca extends Nekretnina {

    private double povrsinaOkucnice;


    @Override
    public double izracunajCenu() {

        double cena = 0;

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

    public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) throws Exception {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;

        if (povrsinaOkucnice < 1){
            throw new Exception("KPogresno uneta povrsina okucnice");
        }
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
        return "Podaci o kuci: \nAdresa: " + getAdresa() + "\nZona: " + getZona() + "\nKvadratura: " + getKvadratura() + "\nPovrsina okucnice: " + getPovrsinaOkucnice() + " kvm. \nCena kuce iznosi " + izracunajCenu() + " EUR. \nPodaci o vlasniku: \n" + getVlasnik();
    }
}
