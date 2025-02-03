//package Altklausuren.OnlineShop;
//
//public class Bestellung {
//    int bestellnummer;
//    private Artikel[] artikel = new Artikel[50];
//
//    public Bestellung(int bestellnummer, Artikel... in) {
//        for (int i = 0; i < this.artikel.length; i++) {
//            artikel[i] = in[i];
//            this.bestellnummer = bestellnummer;
//        }
//    }
//
//    public void einfuegen(Artikel in) {
//        for (int i = 0; i < artikel.length; i++) {
//            if (!isFull()) {
//                if (artikel[i] == null) {
//                    artikel[i] = in;
//                }
//            }
//        }
//    }
//
//    public void loeschen(Artikel in) {
//
//    }
//
//    private boolean isFull() {
//        int counter = 0;
//        for (int i = 0; i < artikel.length; i++) {
//            if (artikel[i] == null) {
//                counter++;
//            }
//        }
//        if (counter == 0) {
//            return true;
//        } else return false;
//    }
//
//    public Artikel getArtikelName(Artikel in) {
//        Artikel temp = in;
//        for (int i = 0; i < artikel.length; i++) {
//            if (temp == artikel[i]) {
//                return artikel[i].name
//            }a
//        }
//    }
//
//}
