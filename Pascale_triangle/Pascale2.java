import java.util.ArrayList;

public class Pascale2 {
     public static void main(String[] args) {
        triangle(3);
    }

    static void triangle(int n){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int sum=0;
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=1; i<=n+1; i++){
            for(int j=1; j<=i; j++){
                sum=0;
                if(j==1){
                    list.get(i-1).add(1);
                    
                }
                else if(j==i){
                    list.get(i-1).add(1);
                   
                }
                    else{
                    sum =list.get(i-2).get(j-2)+ list.get(i-2).get(j-1);
                       list.get(i-1).add(sum);


                   }
            }
        }

        System.out.println(list);

        for(int i=1; i<=n+1; i++){
            list1.add(list.get(n).get(i-1));
        }

        System.out.println(list1);
    }
}
