package zadatak1;

public class Vlasnik {

    String imeIPrezime;
    String jmbg;
    String brojLicneKarte;

    public Vlasnik() {
    }

    public Vlasnik(String imeIPrezime, String jmbg, String brojLicneKarte) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    @Override
    public String toString() {
        return getImeIPrezime() + ", jmbg: " + getJmbg() + ", broj licne karte: " + getBrojLicneKarte();
    }
}
