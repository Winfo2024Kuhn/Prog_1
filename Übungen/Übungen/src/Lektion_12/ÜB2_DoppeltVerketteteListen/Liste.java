package Lektion_12.ÜB2_DoppeltVerketteteListen;

public class Liste {
    private PersonenKnoten start;

    public Liste() {
        start = null;
    }

    public void sortInsert(PersonenKnoten neu) {
        if (start == null) {
            start = neu;
        } else if (neu.alter <= start.alter) {
            neu.next = start;
            start.prev = neu;
            start = neu;
        } else {
            PersonenKnoten current = start;
            PersonenKnoten prev = null;
            while (current != null && current.alter < neu.alter) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                prev.next = neu;
                neu.prev = prev;
            } else {
                prev.next = neu;
                neu.next = current;
                neu.prev = prev;
                current.prev = neu;
            }
        }
    }

    public PersonenKnoten getPerson(String nachname) {
        PersonenKnoten current = start;
        while (!current.nachname.equals(nachname)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Der Nachnahme ist nicht in der Liste enthalten...");
            return null;
        } else return current;
    }

    public void print() {
        String s = "";
        PersonenKnoten current = start;
        PersonenKnoten prev = null;

        System.out.println("Die Liste vorwärts: ");
        while (current != null) {
            s += current.toString() + " --> ";
            prev = current;
            current = current.next;
        }
        System.out.println(s);
        System.out.println("Die Liste rückwärts: ");
        s = "";
        current = prev;
        while (current != null) {
            s += current.toString() + " <-- ";
            current = current.prev;
        }
        System.out.println(s);
    }
}
