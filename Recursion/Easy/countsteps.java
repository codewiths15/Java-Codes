package Recursion.Easy;
//leetcode problem number 1342
public class countsteps {
    
    public static void main(String[] args) {
        System.out.println(count1(14));
    }

    static int count1(int n){

        int count =0;
        return helper(n, count);
    }

    static int helper(int n, int count){
        if(n==0){
            return count;
        }

        if(n%2==0){
            return helper(n/2, ++count);
        }
        return helper(n-1, ++count);
    }


}
