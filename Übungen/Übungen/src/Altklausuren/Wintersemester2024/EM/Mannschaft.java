package Altklausuren.Wintersemester2024.EM;

public class Mannschaft {
    public int tore;
    public int gegentore;
    private String name;

    public Mannschaft(String name, int tore) {
        this.name = name;
        this.tore = tore;
    }

    public String getName() {
        return name;
    }
}
