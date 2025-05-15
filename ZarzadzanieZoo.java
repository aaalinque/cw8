public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = new Zwierze[] {
                new Lew("Simba", 5),
                new Orzel("Bielik", 3),
                new Krokodyl("Kroko", 12)
        };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("-----");
        }
    }
}
