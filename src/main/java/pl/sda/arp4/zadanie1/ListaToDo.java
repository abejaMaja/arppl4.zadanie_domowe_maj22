package pl.sda.arp4.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaToDo {
    private List<Zadanie> listaZadan = new ArrayList<>();

    public void dodajZadanie(Zadanie zadanie) {
        System.out.println(zadanie + " ZOSTAŁO DODANE!");
        listaZadan.add(zadanie);
    }

    public void usunZadanie(String nazwa) {
        listaZadan.removeIf(element -> (element.getNazwa().equalsIgnoreCase(nazwa)));
    }

    public void oznaczZadanie(String nazwa) {
        for (Zadanie element : listaZadan) {
            if (element.getNazwa().equalsIgnoreCase(nazwa)) {
                element.setZrealizowane(true);
                System.out.println("Zadanie " + element + " jest zrealizowene");
            }

        }
    }

    public Optional<Zadanie> wypiszZadaniePelnaNazwa(String nazwa) {
        System.out.println("Zadanie o nazwie " + nazwa + " to ");
        for (Zadanie element : listaZadan) {
            if (element.getNazwa().equals(nazwa)) {
                System.out.println(element);
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }

    public void wypiszZadanieFraza(String fraza) {
        System.out.println("Zadania o nazwie " + fraza + " to ");
        for (Zadanie element : listaZadan) {
            if (element.getNazwa().contains(fraza)) {
                System.out.println(element);

            }
        }

    }

    public void wypiszZadanieZrealizowane() {
        System.out.println("Zadania zrealizowane ");
        for (Zadanie element : listaZadan) {
            if (element.isZrealizowane()) {
                System.out.println(element);

            }
        }

    }

    public void wypiszZadanieNieZrealizowane() {
        System.out.println("Zadania niezrealizowane ");
        for (Zadanie element : listaZadan) {
            if (!element.isZrealizowane()) {
                System.out.println(element);

            }
        }

    }

    public void wypisz() {
        System.out.println("lista zadan: ");
        for (Zadanie element : listaZadan
        ) {
            System.out.println(element);
        }
    }

    public List<Zadanie> zwrocZadanieFraza(String fraza) {
        List<Zadanie> lista = new ArrayList<>();
        System.out.println("Zadania o nazwie " + fraza + " to ");
        for (Zadanie element : listaZadan) {
            if (element.getNazwa().contains(fraza)) {
                lista.add(element);

            }
        }
        for (Zadanie element : lista) {
            System.out.println(lista);
        }
        return lista;
    }

    public List<Zadanie> zwrocZadanieZrealizowane() {
        List<Zadanie> lista = new ArrayList<>();
        System.out.println("Zadania zrealizowane ");
        for (Zadanie element : listaZadan) {
            if (element.isZrealizowane()) {
                lista.add(element);

            }
        }
        for (Zadanie element : lista) {
            System.out.println(lista);
        }
        return lista;
    }

    public List<Zadanie> zwrocZadanieNieZrealizowane() {
        List<Zadanie> lista = new ArrayList<>();
        System.out.println("Zadania niezrealizowane ");
        for (Zadanie element : listaZadan) {
            if (!element.isZrealizowane()) {
                lista.add(element);

            }
        }
        for (Zadanie element : lista) {
            System.out.println(lista);
        }

        return lista;
    }
}
