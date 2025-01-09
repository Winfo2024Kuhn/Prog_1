package Lektion_8;

public class ÜB5_CarInstance {
    public static void main(String[] args) {

        ÜB5_CarClass sportsCar = new ÜB5_CarClass();
        sportsCar.brand = "Porsche";
        sportsCar.model = "911";
        sportsCar.displacement = 3000; // Hubraum in ccm
        sportsCar.color = "Rot";
        sportsCar.ps = 450; // Motorleistung in PS
        sportsCar.weight = 1.5f; // Gewicht in Tonnen
        sportsCar.price = 120000.0f; // Kaufpreis in Euro

        ÜB5_CarClass familyCar = new ÜB5_CarClass();
        familyCar.brand = "Volkswagen";
        familyCar.model = "Touran";
        familyCar.displacement = 1600; // Hubraum in ccm
        familyCar.color = "Weiß";
        familyCar.ps = 150; // Motorleistung in PS
        familyCar.weight = 1.6f; // Gewicht in Tonnen
        familyCar.price = 35000.0f; // Kaufpreis in Euro

        ÜB5_CarClass electricCar = new ÜB5_CarClass();
        electricCar.brand = "Tesla";
        electricCar.model = "Model 3";
        electricCar.displacement = 0; // Keine Verbrennung, daher 0
        electricCar.color = "Schwarz";
        electricCar.ps = 350; // Motorleistung in PS
        electricCar.weight = 1.8f; // Gewicht in Tonnen
        electricCar.price = 45000.0f; // Kaufpreis in Euro

        ÜB5_CarClass[] cars = {sportsCar, familyCar, electricCar};
        ÜB5_CarClass largestDisplacementCar = cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].displacement > largestDisplacementCar.displacement) {
                largestDisplacementCar = cars[i];
            }
        }

        // Ausgabe der Daten des Autos mit dem größten Hubraum
        System.out.println("Auto mit dem größten Hubraum:");
        System.out.println("Marke: " + largestDisplacementCar.brand);
        System.out.println("Modell: " + largestDisplacementCar.model);
        System.out.println("Hubraum: " + largestDisplacementCar.displacement + " ccm");
        System.out.println("Farbe: " + largestDisplacementCar.color);
        System.out.println("PS: " + largestDisplacementCar.ps);
        System.out.println("Gewicht: " + largestDisplacementCar.weight + " Tonnen");
        System.out.println("Preis: " + largestDisplacementCar.price + " Euro");

    }
}
