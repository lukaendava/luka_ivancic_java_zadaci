package zadatak1;

public class Main {

    public static void main(String[] args) {

        Vlasnik vlasnik1 = new Vlasnik("Luka Ivancic", "1234567890", "0098765");
        Vlasnik vlasnik2 = new Vlasnik("Pera Perovic", "0952857264627", "00928462");

        Stan stan = new Stan("Milana Stepanovica Matroza 5", 3, 80.2, vlasnik1, 10.0, 7.2);
        Kuca kuca = new Kuca("Oracka 65", 4, 102.3, vlasnik2,50.8);

        System.out.println("Podaci o vlasnicima: ");
        System.out.println(vlasnik1);
        System.out.println(vlasnik2);
        System.out.println("_______________________");
        System.out.println(stan);
        System.out.println(kuca);









    }
}
