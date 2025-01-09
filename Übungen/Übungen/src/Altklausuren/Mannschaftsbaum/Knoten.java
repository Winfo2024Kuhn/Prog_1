package Altklausuren.Mannschaftsbaum;

public class Knoten {

    public Mannschaft mannschaft;
    public Knoten links;
    public Knoten rechts;

    public Knoten(Mannschaft mannschaft){
        this.mannschaft = mannschaft;
        this.links = null;
        this.rechts = null;
    }
    public int getTore(){
        return mannschaft.getTore();
    }
    public String getName(){
        return mannschaft.getName();
    }
    public Mannschaft getMannschaft(){
        return (mannschaft);
    }
}
