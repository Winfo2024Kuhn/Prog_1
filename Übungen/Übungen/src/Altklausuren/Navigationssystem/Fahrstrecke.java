package Altklausuren.Navigationssystem;

public class Fahrstrecke {
    Zielort start;

    public Fahrstrecke() {
        start = null;
    }

    /**
     * Iteratives Einfügen am Ende der Liste.
     * Wenn start == null, wird das erste Element gesetzt,
     * sonst suchen wir das Ende und hängen newZielort an.
     */
    public void einfuegen(Zielort newZielort) {
        if (start == null) {
            start = newZielort;
        } else {
            Zielort temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newZielort;
        }
    }

    /**
     * Entfernt zufällig einen Knoten (Spieler) aus der Liste
     * und gibt ihn zurück, oder null, wenn die Liste leer ist.
     */
    public Zielort entferneZufall() {
        if (start == null) {
            // Liste leer
            return null;
        }

        // 1) Größe der Liste ermitteln
        int size = 0;
        Zielort temp = start;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // 2) Zufallsindex auswählen (zwischen 0 und size-1)
        int randomIndex = (int) (Math.random() * size);

        // 3) Knoten an diesem Index entfernen
        if (randomIndex == 0) {
            // Entfernen des ersten Elements
            Zielort entferntePerson = start;
            start = start.next;          // Kopf auf das nächste Element setzen
            entferntePerson.next = null; // Verknüpfung kappen (optional)
            return entferntePerson;
        } else {
            // Entfernen in der Mitte oder am Ende
            Zielort prev = start;
            for (int i = 0; i < randomIndex - 1; i++) {
                prev = prev.next;
            }
            // prev zeigt jetzt auf den Knoten VOR dem zu entfernenden
            Zielort entferntePerson = prev.next;
            if (entferntePerson != null) {
                prev.next = entferntePerson.next; // Ausklinken
                entferntePerson.next = null;      // Verknüpfung kappen
            }
            return entferntePerson;
        }
    }

    /**
     * toString() ohne StringBuilder
     * Baut eine Text-Repräsentation der Liste, z. B.:
     * "Diana (Distanz: 1 km) -> Kitzigen (Distanz: 2 km) -> null"
     */
    @Override
    public String toString() {
        String s = "";
        Zielort temp = start;
        while (temp != null) {
            s += temp.toString() + " -> ";
            temp = temp.next;
        }
        s += "null";
        return s;
    }
    public boolean istLeer() {
        return (start == null);
    }

}
