package Arithematic;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isprime(37));
    }

    static boolean isprime(int n){
        if(n==1){
            return false;
        }

        
    //    for(int i=2; i<n; i++){
    //     if((n%i==0)){
    //         return false;
    //     }

    //    }

    //    return true;

    //second step

    int i=2;
    while((i*i)<=n){
        System.out.println(n+"%"+i);
        if(n%i==0){
            return false;
        }
        i++;
    }

    return true;



      
    }
}
