import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // list.add(100);
        // list.add(100);
        // list.add(100);
        // list.add(100);
        // list.add(100);
        // list.add(100);
        // list.add(500);
        // list.add(200);
        // list.add(700);
        // list.add(600);
        // list.add(400);
        // list.add(800);
        // list.add(600);
        // list.add(300);
        // list.add(200);

        // System.out.println(list);

        // //System.out.println(list.contains(800));
        // System.out.println(list);

        // for (int i = 0; i < 10; i++) {

        // list.add(sc.nextInt());
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.println(list.get(i));
        // }

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
