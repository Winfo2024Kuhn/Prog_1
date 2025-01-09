package Altklausuren;

public class HermonischeReihe {
    public static void main(String[] args) {
        double ergebnis = 0; // Variable für die Gesamtsumme

        // Schleife über die ersten 10.000 Glieder der Reihe
        for (int k = 1; k <= 10000; k++) {
            // Berechnung des Vorzeichens von (-1)^(k+1)
            int vorzeichen = 1; // Startwert für das Vorzeichen
            for (int i = 1; i <= k + 1; i++) {
                vorzeichen *= -1; // Multipliziere mit -1 bei jedem Schritt
            }

            // Term der Reihe berechnen
            double term = (double) vorzeichen / k;

            // Zum Gesamtergebnis addieren
            ergebnis += term;
        }

        // Ergebnis ausgeben
        System.out.println("Die Summe der ersten 10.000 Glieder der alternierenden harmonischen Reihe ist: " + ergebnis);
    }
}
