package pl.sda.arp4.zadanie1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Zadanie {
    private String nazwa;
    private String tresc;
    private LocalDateTime data;
    private boolean zrealizowane;

    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.data = LocalDateTime.now();
        this.zrealizowane = false;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isZrealizowane() {
        return zrealizowane;
    }

    public void setZrealizowane(boolean zrealizowane) {
        this.zrealizowane = zrealizowane;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss");

        return "{" +
                "Nazwa zadania= " + nazwa + " , " + '\n' +
                " Tresc zadania= " + tresc + " , " + '\n' +
                " Godzina i data= " + fmt.format(data) + " , " + '\n' +
                " Czy zrealizowane= " + zrealizowane + " , " + '\'' +
                '}' + '\n';
    }

}
