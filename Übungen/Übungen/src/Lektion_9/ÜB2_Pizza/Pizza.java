package Lektion_9.ÜB2_Pizza;

public class Pizza {
    public String name;
    public int diameter;
    public float price;

    public Pizza(String name, int diameter, float price) {
        this.name = name;
        if (diameter != 0) {
            this.diameter = diameter;
        } else this.diameter = 28;
        if (price != 0) {
            this.price = price;
        } else this.price = 12;
    }

    public static Pizza getBestPricePerformanceRatio(Pizza[] menu) {

        Pizza bestPizza = menu[0]; // Start mit der ersten Pizza
        float bestPVRatio = (float) bestPizza.diameter / bestPizza.price; // Initialisiere mit der ersten Pizza

        for (int i = 0; i < menu.length; i++) {
            float currentPVRatio = (float) menu[i].diameter / menu[i].price;
            if (currentPVRatio > bestPVRatio) {
                bestPVRatio = currentPVRatio;
                bestPizza = menu[i];
            }
        }

        return bestPizza; // Rückgabe der besten Pizza
    }
}