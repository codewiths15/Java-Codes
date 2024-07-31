package Arithematic;

public class SetofPrime {
    
    public static void main(String[] args) {
        
        int n=40;
        boolean[] prime = new boolean[n+1];
        setofprime(n,prime);
    }

    static void setofprime(int n, boolean[] prime){
        for(int i=2;i*i<=n; i++){    //continue loop only until the square root of the number
            if(!prime[i]){

                for(int j=i*2; j<=n; j+=i){   //put all the multiples of number i to true that means it does not come in prime number.
                    prime[j]=true;
                    
                }
            }
        }

        System.out.print("Set of prime numbers below "+ n + " is :");
        for(int i=2; i<=n; i++){

            if(!prime[i]){
                
                System.out.print(i+", ");
            }
        }
    }
}
