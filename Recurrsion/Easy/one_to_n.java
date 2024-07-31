package Recurrsion.Easy;

public class one_to_n {

    public static void main(String[] args) {
        Bothfunc(5);

    }

    static void func(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        func(n - 1);
    }

    static void Revfunc(int n) {

        if (n == 0) {
            return;
        }

        Revfunc(n - 1);
        System.out.println(n);
    }

    static void Bothfunc(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        Bothfunc(n - 1);
        System.out.println(n);
    }
}
