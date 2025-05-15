public class Orzel extends Ptak {
    public Orzel(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Pisk";
    }

    @Override
    public String poruszSie() {
        return "Lata po niebie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i przestworza";
    }
}
