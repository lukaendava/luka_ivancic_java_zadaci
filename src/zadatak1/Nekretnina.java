package zadatak1;

public abstract class Nekretnina {

    private String adresa;
    private int zona;
    private double kvadratura;
    private Vlasnik vlasnik;
    public static final String greska = "Pogresno unet podatak!";

    public abstract double izracunajCenu();

    public Nekretnina() {
    }

    public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) throws Exception {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;

        if(adresa.isEmpty() || adresa.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$")){

            throw new Exception("Adresa je pogresno uneta");
        }

        if (zona < 1 || zona > 4){
            throw new Exception("Zona mora biti od 1 - 4");
        }

        if (kvadratura <= 0 ){
            throw new Exception("Kvadratura stana mora biti izmedju 0 kvm i 5000 kvm!");
        }

        if(vlasnik == null || !(vlasnik instanceof Vlasnik)){
            throw new Exception("Podaci o vlasniku su nepotpuni!");
        }


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

    public void setZona(int zona) throws Exception{
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
