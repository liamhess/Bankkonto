public class App {
    public static void main(String[] args) {
        Konto felixKonto = new Konto(69420, "Felix", 1000);
        System.out.println("\nInhaber: " + felixKonto.inhaber);
        System.out.println("Kontonummer: " + felixKonto.nummer);
        System.out.println("Kontostand: " + felixKonto.gibKontostand() + "€" + "\n");

        Konto yangyiKonto = new Konto(69420, "Yang Yi", 1000);
        System.out.println("\nInhaber: " + yangyiKonto.inhaber);
        System.out.println("Kontonummer: " + yangyiKonto.nummer);
        System.out.println("Kontostand: " + yangyiKonto.gibKontostand() + "€\n");

        felixKonto.einziehen(500, yangyiKonto);

        System.out.println("\nInhaber: " + felixKonto.inhaber);
        System.out.println("Kontonummer: " + felixKonto.nummer);
        System.out.println("Kontostand: " + felixKonto.gibKontostand() + "€" + "\n");

        System.out.println("\nInhaber: " + yangyiKonto.inhaber);
        System.out.println("Kontonummer: " + yangyiKonto.nummer);
        System.out.println("Kontostand: " + yangyiKonto.gibKontostand() + "€\n");
    }
}