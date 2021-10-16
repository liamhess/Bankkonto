import java.util.ArrayList;

public class Konto {
    int nummer;
    String inhaber;
    private int kontostand;
    ArrayList<Konto> bevollmaechtigte = new ArrayList<Konto>();

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

    public void bevollmaechtigen (Konto bevollmaechtigter) {
        bevollmaechtigte.add(bevollmaechtigter);
    }

    public void entmaechtigen (Konto bevollmaechtigter) {
        if (bevollmaechtigte.contains(bevollmaechtigter)) {
            bevollmaechtigte.remove(bevollmaechtigter);
        }
    }

    public void einziehen(int betrag, Konto belastender) {
        if (belastender.bevollmaechtigte.contains(this)) {
            belastender.abheben(betrag);
            this.einzahlen(betrag);
            System.out.println("\n" + this.inhaber + " hat " + betrag + "€ von " + belastender.inhaber + " eingezogen.\n");
        } else {
            System.out.println("Hier liegt kein Einverständnis vor!");
        }
        
    }

    public void outputData() {
        System.out.println("\nInhaber: " + inhaber);
        System.out.println("Kontonummer: " + nummer);
        System.out.println("Kontostand: " + kontostand + "€\n");
    }

}