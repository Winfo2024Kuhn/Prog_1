package Altklausuren.Geschenke;

public class Geschenk {
    private String absender;
    private String empfänger;
    private int wert;
    private String inhalt;
    private boolean isOpen = false;

    public Geschenk(String absender, String empfänger, int wert, String inhalt) {
        this.absender = absender;
        this.empfänger = empfänger;
        this.wert = wert;
        this.inhalt = inhalt;
    }

    public String getAbsender() {
        if (isOpen) return this.absender;
        else return "Das Geschenk bleibt verschlossen";
    }
    public String getInhalt(){
        if(isOpen) return this.inhalt;
        else return "Das Geschenk bleibt verschlossen";
    }
    public Geschenk auspacken(String empfänger){
        if (empfänger.equals(this.empfänger)){
            isOpen = true;
        }
        return (this);
    }
    public String toString(){
        double euro = wert/1000d;
        String out = "";
        if (isOpen){
            out += inhalt + "\nkommt von: " + absender + "\nund ist für: " + empfänger + "\nund hat gekostet: "+ wert;
        }
        else out += "Das Geschenk ist noch verschlossen";
        return out;
    }
}
