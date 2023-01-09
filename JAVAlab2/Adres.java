package pl.uwm.wmii.kmmi.grabowska;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania; // opcjonalne
    private String miasto;
    private String kod_pocztowy;

    // konstruktor z numerem mieszkania
    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    // konstruktor bez numeru mieszkania
    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_mieszkania = "";
    }

    //wypisuje w pierwszej linii kod pocztowy i miasto,
    //a w następnej linii pozostałe informacje
    public void pokaz() {
        if (numer_mieszkania != "")
        {
            System.out.println(kod_pocztowy + " " + miasto + "\n" + ulica + " " + numer_domu);
            return;
        }

        System.out.println(kod_pocztowy + " " + miasto + "\n" + ulica + " " + numer_domu + "/" + numer_mieszkania);
    }

    public String get_kod_pocztowy()
    {
        return kod_pocztowy;
    }

    // sprawdza, czy dany adres występuje przed innym (porównuj tylko kody pocztowe)
    public boolean przed(Adres adres2)
    {
        int first = Integer.parseInt(kod_pocztowy.replace("-",""));
        int second = Integer.parseInt(adres2.get_kod_pocztowy().replace("-",""));

        return first < second;
    }
}
