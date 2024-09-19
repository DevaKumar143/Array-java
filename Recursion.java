import java.util.*;
public class Recursion {
    // public static void printInc(int n) {
    //     if (n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     printInc(n - 1);
    //     System.out.print(n + " ");
    // }

    // public static void printDec(int n) {
    //     if (n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDec(n - 1);
    // }
  
    // public static int fib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //         int fnm1 = fib(n-1);
    //         int fnm2 = fib(n-2);
    //         int fn = fnm1+fnm2;

    //         return fn;
        
    // }
    // public static void main(String args[]) {
    //     int n = 15;
    //     // printInc(n);
    //     // printDec(n);
    //     System.out.println(fib(n));
    // }

  // To find the factorial 
    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     // int fact1 = fact(n-1);
    //     int fn = n*fact(n-1);
    //     return fn;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a Number to find factorial");
    //     int n = sc.nextInt();
    //     // System.out.println(fact(n));
    //     System.out.println("The factorial of number is : "+ fact(n));
    // }

    //the sum of n natural number is 
    // public static int calcsum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int s1 = calcsum(n-1);
    //     int sn = n+ s1;
    //     return sn;
    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     System.out.println(calcsum(n));
    // }
  // fib sequence of number

    // public static int fib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int x = fib(n-1);
    //     int y = fib(n-2);

    //     int fn = x+y;

    //     return fn;
    // }
    // public static void main(String[] args) {
    //     int n =10;
    //     System.out.println(fib(n));
    // }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[2];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // for(int i =1;i<=arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        for(int j=a;j<=c;j++){
             int sum = a+j*c;
            System.out.print(sum+ " ");
        }
    }
}
