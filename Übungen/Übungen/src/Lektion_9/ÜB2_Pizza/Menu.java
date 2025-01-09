package Lektion_9.ÜB2_Pizza;

public class Menu {
    public static void main(String[] args) {
        // Menü erstellen
        Pizza margarita = new Pizza("Margarita", 28, 12.40f);
        Pizza hawaii = new Pizza("Hawaii", 32, 13.5f);
        Pizza speziale = new Pizza("Speziale", 32, 14.9f);
        Pizza prosciutto = new Pizza("Prosciutto", 28, 13.2f);
        Pizza salami = new Pizza("Salami", 32, 14.6f);
        Pizza fungi = new Pizza("Fungi", 32, 8.9f);

        // Array von Pizzen
        Pizza[] menu = {margarita, hawaii, speziale, prosciutto, salami, fungi};

        // Beste Preis-Leistung-Pizza ermitteln
        Pizza bestPizza = Pizza.getBestPricePerformanceRatio(menu);

        // Ergebnis ausgeben
        System.out.println("Beste Pizza: " + bestPizza.name +
                " mit Durchmesser " + bestPizza.diameter +
                " und Preis " + bestPizza.price);

    }
}
