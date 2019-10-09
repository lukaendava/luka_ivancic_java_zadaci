package zadatak1;

/* Napraviti apstraktnu klasa Nekretnina koja od atributa ima adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik. Vlasnik ima puno ime i prezime, JMBG i broj lične karte.
 Izvedene klase, Stan i Kuca imaju toString() metod gde se ispisuju sve informacije o nekretnini uključujući Vlasnika i cenu
 Cena se računa po principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500 €)
 Kuća ima dodatno polje površinaOkućnice.
 U cenu kuće ulazi i cena okućnice koja se računa po principu (površinaOkućnice X zona X 15%)
 Stan ima dva dodatna polja , površinaPodruma i površinaTerase.
 U cenu Stana ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X Zona X 33%)
 Napraviti Main klasu i u njoj kreirati instance klase Nekretnina i napraviti objekte izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekata – toString()*/



public class Main {

    public static void main(String[] args) throws Exception {
            Vlasnik vlasnik1 = null;
            Vlasnik vlasnik2 = null;
            Stan stan = null;
            Kuca kuca = null;

        try {
             vlasnik1 = new Vlasnik("Luka Ivančić", "1111111111111", "111111111");
             stan = new Stan("Milana Stepanovića Matroza 5", 2, 80.2, vlasnik1, 10.0, 7.2);
             System.out.println(vlasnik1);
             System.out.println("*****************");
             System.out.println(stan);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("----------------------------------------------------------------");

        try {
            vlasnik2 = new Vlasnik("Pera Perović'", "2222222222222", "222222222");
            kuca = new Kuca("Oracka 60", 1, 80, vlasnik2,10);
            System.out.println(vlasnik2);
            System.out.println("*****************");
            System.out.println(kuca);
        } catch (Exception e) {
            System.out.println(e);;
        }

    }
}
