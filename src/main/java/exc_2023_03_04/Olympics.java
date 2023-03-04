package exc_2023_03_04;

import java.util.ArrayList;

public class Olympics {
    public static void main(String[] args) {
        ArrayList<Integer> years = new ArrayList<>();

        for (int i = 1896; i < 2023; i += 4) {
            years.add(i);
            System.out.println(i);
        }

        for (Integer year: years) {
            System.out.println(year);
        }
    }
}
