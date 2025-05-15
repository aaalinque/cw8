public class Krokodyl extends Gad {
    public Krokodyl(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Chrumknięcie";
    }

    @Override
    public String poruszSie() {
        return "Pełza i pływa";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Rzeki i bagna";
    }
}
