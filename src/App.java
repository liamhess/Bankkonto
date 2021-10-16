public class App {
    public static void main(String[] args) {
        Konto felixKonto = new Konto(69420, "Felix", 1000);
        felixKonto.outputData();

        Konto yangyiKonto = new Konto(69420, "Yang Yi", 1000);
        yangyiKonto.outputData();

        felixKonto.einziehen(500, yangyiKonto);
        felixKonto.outputData();
        yangyiKonto.outputData();

        felixKonto.ueberweisen(250, yangyiKonto);
        felixKonto.outputData();
        yangyiKonto.outputData();
    }
}