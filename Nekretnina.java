package zadatak1;

public abstract class Nekretnina {

    private String adresa;
    private int zona;
    private double kvadratura;
    private Vlasnik vlasnik;


    public abstract double izracunajCenu();

    public Nekretnina() {
    }

    public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }


    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        return "Nekretnina se nalazi na adresi " + getAdresa() + " i velicine je " + getKvadratura() + " kvm. Nalazi se u " + getZona() + "-oj zoni. Podaci o vlasniku: " + vlasnik;
    }


}
