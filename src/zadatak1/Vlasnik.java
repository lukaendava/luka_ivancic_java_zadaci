package zadatak1;

public class Vlasnik {

    String imeIPrezime;
    String jmbg;
    String brojLicneKarte;

    public Vlasnik() {
    }

    public Vlasnik(String imeIPrezime, String jmbg, String brojLicneKarte) throws Exception {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.brojLicneKarte = brojLicneKarte;

        if(imeIPrezime.isEmpty() || !imeIPrezime.matches(".*\\W.*") || imeIPrezime.length()<4){
            throw new Exception("Ima i prezime vlasnika nepravilno uneseni!");
        }
        if (jmbg == null || jmbg.length() != 13 || !jmbg.toLowerCase().matches("[0-9]+")){
            throw new Exception("JMBG mora imati tacno 13 karaktera i ne sme sadrzati slova!");
        }
        if (brojLicneKarte == null || brojLicneKarte.isEmpty() || brojLicneKarte.isEmpty() || brojLicneKarte.length() != 9 || !brojLicneKarte.toLowerCase().matches("[0-9]+")){
            throw new Exception("Broj licne karte mora imati tacno 9 cifara i ne sme sadrzati slova!");
        }

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
        return getImeIPrezime() + "\njmbg: " + getJmbg() + "\nbroj licne karte: " + getBrojLicneKarte() + "\n";
    }
}
