public abstract class Zwierze {
    private String nazwa;
    private int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract String wydajDzwiek();

    public abstract String poruszSie();

    public abstract String srodowiskoNaturalne();

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Wiek: " + wiek);
        System.out.println("Dźwięk: " + wydajDzwiek());
        System.out.println("Poruszanie się: " + poruszSie());
        System.out.println("Środowisko naturalne: " + srodowiskoNaturalne());
    }
}
