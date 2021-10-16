public class Konto {
    int nummer;
    String inhaber;
    private int kontostand;

    public Konto(int nummer, String inhaber) {
        this.nummer = nummer;
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public Konto(int nummer, String inhaber, int begruessungsGeld) {
        this.nummer = nummer;
        this.inhaber = inhaber;
        kontostand = begruessungsGeld;
    }

    public int gibKontostand() {
        return kontostand;
    }

    public void einzahlen(int betrag) {
        kontostand += betrag;
    }

    public void abheben(int betrag) {
        kontostand -= betrag;
    }

    public void ueberweisen(int betrag, Konto empfaenger) {
        this.abheben(betrag);
        empfaenger.einzahlen(betrag);
        System.out.println("\n" + betrag + "€ von " + this.inhaber + " an " + empfaenger.inhaber + " überwiesen.\n");
    }

    public void einziehen(int betrag, Konto belastender) {
        belastender.abheben(betrag);
        this.einzahlen(betrag);
        System.out.println("\n" + this.inhaber + " hat " + betrag + "€ von " + belastender.inhaber + " eingezogen.\n");
    }

    public void outputData() {
        System.out.println("\nInhaber: " + inhaber);
        System.out.println("Kontonummer: " + nummer);
        System.out.println("Kontostand: " + kontostand + "€\n");
    }

}