package Muetzensammlung;

public class Kleiderschrank {
    Muetze ende;

    public Kleiderschrank() {
        ende = null;
    }
    public void einfuegen(Muetze in){
        // Leere Liste
        if (isEmpty()){
            ende = in;
        }
        // Am Anfang einfügen
        else if (in.getWert() < ende.getWert()){
            in.prev = ende;
            ende = in;
        }
        // Zwischen drinnen einfügen
        else {
            Muetze temp = ende;
            while (temp.prev != null){
                if (temp.prev.getWert() > in.getWert()){
                    in.prev = temp.prev;
                    temp.prev = in;
                    break;
                }
                temp = temp.prev;
            }
            if (temp.prev == null){
                temp.prev = in;
            }
        }
    }
    public Muetze herausnehmen(int in){
        Muetze temp = ende;
        Muetze prevTemp = temp;
        if (!isEmpty()){
            while (temp != null){
                if (temp.getWert() == in){
                    if (temp == ende){
                        ende = ende.prev;
                        break;
                    }
                    else if (temp.prev == null){
                        prevTemp.prev = null;
                        break;
                    }
                    else {
                        prevTemp.prev = temp.prev;
                        break;
                    }
                }
                prevTemp = temp;
                temp = temp.prev;
            }
            System.out.println("Die herausgenommene Mütze: "+ temp);
            return temp;
        }
        else return null;
    }

    public boolean isEmpty() {
        return ende == null;
    }
    public void print(){
        System.out.println();
        Muetze temp = ende;
        if (!isEmpty()) {
            while (temp != null){
                System.out.println(temp);
                temp = temp.prev;
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Muetze[] sammlung = new Muetze[8];
        sammlung[0] = new Muetze("Schwarz",20);
        sammlung[1] = new Muetze("Beige",43);
        sammlung[2] = new Muetze("Lila",67);
        sammlung[3] = new Muetze("Blau",21);
        sammlung[4] = new Muetze("Grün",90);
        sammlung[5] = new Muetze("Hellgrau",1);
        sammlung[6] = new Muetze("Türkis",6);
        sammlung[7] = new Muetze("Gelb",23);
        Kleiderschrank holz = new Kleiderschrank();
        for (int i = 0; i<sammlung.length; i++){
            holz.einfuegen(sammlung[i]);
        }
        holz.print();
        holz.herausnehmen(20);
        holz.herausnehmen(1);
        holz.herausnehmen(90);
        holz.print();
    }
}
