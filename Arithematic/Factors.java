package Arithematic;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20);

    }

    static void factors1(int n) {

        int i = 1;
        while (i <= n) {

            if ((n % i) == 0) {
                System.out.println(i);

            }
            i++;
        }
    }

    static void factors2(int n) {

        int i = 1;
        while (i <= Math.sqrt(n)) {

            if ((n % i) == 0) {

                if ((n / i) == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + (n / i) + " ");
                }

            }
            i++;
        }
    }

    static void factors3(int n) {

        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i <= Math.sqrt(n)) {

            if ((n % i) == 0) {

                if ((n / i) == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add((n / i));
                }

            }
            i++;
        }

        for (int j = list.size()-1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }

}
