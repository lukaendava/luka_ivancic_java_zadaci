package zadatak1;

public class Stan extends Nekretnina {

    private double povrsinaPodruma;
    private double povrsinaTerase;
    private double cena;

    @Override
    public double izracunajCenu() {

        if (getZona() == 1){

            cena = (getKvadratura() * 3000) + ((getPovrsinaPodruma() + getPovrsinaTerase()) * getZona() * 0.15);

        }
        if (getZona() == 2){

            cena = (getKvadratura() * 2000) + ((getPovrsinaPodruma() + getPovrsinaTerase()) * getZona() * 0.15);

        }
        if (getZona() == 3){

            cena = (getKvadratura() * 1000) + ((getPovrsinaPodruma() + getPovrsinaTerase()) * getZona() * 0.15);

        }
        if (getZona() == 4){

            cena = (getKvadratura() * 500) + ((getPovrsinaPodruma() + getPovrsinaTerase()) * getZona() * 0.15);

        }

        return cena;
    }




    public Stan() {
    }

    public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;
    }

    public double getPovrsinaPodruma() {
        return povrsinaPodruma;
    }

    public void setPovrsinaPodruma(double povrsinaPodruma) {
        this.povrsinaPodruma = povrsinaPodruma;
    }

    public double getPovrsinaTerase() {
        return povrsinaTerase;
    }

    public void setPovrsinaTerase(double povrsinaTerase) {
        this.povrsinaTerase = povrsinaTerase;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    //i tried using super.toString() to call the method from Nekretnine
    @Override
    public String toString() {
        return super.toString() + ". Stan ima terasu velicine " + getPovrsinaTerase() + " kvm i podrum velicine " + getPovrsinaPodruma() + " kvm. Cena stana iznosi " + izracunajCenu() + " EUR.";
    }
}
