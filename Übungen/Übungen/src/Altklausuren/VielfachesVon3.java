package Altklausuren;

public class VielfachesVon3 {
    public static int getVielfachesVon3(int[] in) {
        int counter = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] % 3 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] zahlen = {2, 4, 45, -34, 3, 4556, 9, 3, 6, 90, 36, 33};
        System.out.println(getVielfachesVon3(zahlen));
    }
}
