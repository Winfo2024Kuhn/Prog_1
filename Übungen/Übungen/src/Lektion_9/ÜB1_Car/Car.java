package Lektion_9.ÜB1_Car;

public class Car {
    // Automarke
    String brand;
    // Modell
    String model;
    // Hubraum
    int displacement;
    // Farbe
    String color;
    // Motorleistung in PS
    int ps;
    // Gewicht in Tonnen
    float weight;
    // Kaufpreis in €
    float price;

    static int anzahlProdAutos = 0;

    public Car(String brand, String model, int displacement, String color, int ps, float weight, float price) {
        this.brand = brand;
        this.model = model;
        if (displacement != 0) {
            this.displacement = displacement;
        } else this.displacement = 1600;
        this.color = color;
        this.ps = ps;
        this.weight = weight;
        this.price = price;
        anzahlProdAutos++;
    }

    public void setDisplacement(int displacement) {
        if (displacement != 0) {
            this.displacement = displacement;
        }
    }
}
