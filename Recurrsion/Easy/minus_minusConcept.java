package Recurrsion.Easy;

public class minus_minusConcept {

    public static void main(String[] args) {

        minus(5);
    }

    static void minus(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        // minus(n--); 
        //It is wrong as it will first pass n then it will minus it. SO as
        // it first pass 5 then again the function will be called for 5 and so on going
        // into continuous loop.
        minus(--n);


    }
}
