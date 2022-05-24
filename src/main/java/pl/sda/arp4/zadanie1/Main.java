package pl.sda.arp4.zadanie1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ListaToDo listaZadan = new ListaToDo();
        listaZadan = null;
        Scanner scanner = new Scanner(System.in);
        String komenda;

        do {
            System.out.println("podaj komende: (dodaj, usun, oznacz, szukajNazwa, szukajFraza, zrealizowane, niezrealizowane, wypisz, zwrocFraza, zwrocZrealizowane, zwrocNiezrealizowane, koniec)");
            komenda = scanner.next();
            if (komenda.equals("dodaj")) {
                System.out.println("Podaj nazwę zadania:");
                String nazwa = scanner.next();
                System.out.println("Podaj tresc zadania: " + nazwa);
                scanner.nextLine();
                String tresc = scanner.nextLine();
                Zadanie zadanie = new Zadanie(nazwa, tresc);
                listaZadan.dodajZadanie(zadanie);
                System.out.println(listaZadan);
            } else if (komenda.equals("usun") && listaZadan != null) {
                System.out.println("Podaj zadanie do usunięcia z dostępnych poniżej ");
                listaZadan.wypisz();
                String nazwa = scanner.next();
                listaZadan.usunZadanie(nazwa);
                System.out.println("zadanie zostało usunięte");
            } else if (komenda.equals("oznacz") && listaZadan != null) {
                System.out.println("Podaj zadanie do oznaczenia jako zrealizowane ");
                listaZadan.wypisz();
                String nazwa = scanner.next();
                listaZadan.oznaczZadanie(nazwa);
            } else if (komenda.equals("szukajNazwa") && listaZadan != null) {
                System.out.println("Podaj pełną nazwę zadania którego szukasz ");
                String nazwa = scanner.next();
                listaZadan.wypiszZadaniePelnaNazwa(nazwa);
            } else if (komenda.equals("szukajFraza") && listaZadan != null) {
                System.out.println("Podaj frazę zadania którego szukasz ");
                String fraza = scanner.next();
                listaZadan.wypiszZadanieFraza(fraza);
            } else if (komenda.equals("zrealizowane") && listaZadan != null) {
                listaZadan.wypiszZadanieZrealizowane();
            } else if (komenda.equals("niezrealizowane") && listaZadan != null) {
                listaZadan.wypiszZadanieNieZrealizowane();
            } else if (komenda.equals("wypisz") && listaZadan != null) {
                listaZadan.wypisz();
            } else if (komenda.equals("zwrocFraza") && listaZadan != null) {
                System.out.println("Podaj frazę dla zadania które chcesz mieć zwrócone ");
                String fraza = scanner.next();
                listaZadan.zwrocZadanieFraza(fraza);
            } else if (komenda.equals("zwrocZrealizowane") && listaZadan != null) {
                listaZadan.zwrocZadanieZrealizowane();
            } else if (komenda.equals("zwrocNiezrealizowane") && listaZadan != null) {
                listaZadan.zwrocZadanieNieZrealizowane();
            } else if (!komenda.equalsIgnoreCase("koniec") && listaZadan == null) {
                System.out.println("Zła komenda, lub jeszcze nie zostało utworzone żadne zadanie");

            }

        } while (!komenda.equalsIgnoreCase("koniec"));

    }
}
