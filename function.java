import java.util.*;

public class function {
    // public static boolean isprime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i= 2;i<=Math.sqrt(n);i++){
    //         if(n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isprime(6));
    // }
    // public static boolean isprime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i ==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args){
    //     System.out.println(isprime(7));
    // }

    // public static void binToDec(int binNum){
    //     int myNum = 0;
    // }

    // public static int factorial(int n){
    //     int f = 1;
    //     for(int i=1;i<=n;i++){
    //         f = f*i;
    //     }
    //     return f;
    // }
    
    // public static int binCoeff(int n, int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);

    //     int binCoeff = fact_n/ (fact_r*fact_nmr);
    //     return binCoeff;
    // }

    
    // public static void main(String[] args) {
    //     System.out.println(binCoeff(5, 2));
    //     // System.out.println(factorial(5));
    // }
 

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome%10;
            reverse = reverse*10+remainder;
            palindrome = palindrome/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("This number is not a palindrome");
        }
    }
}
