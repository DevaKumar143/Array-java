import java.util.*;

public class search {

    // Linear search
    // public static int Linersearch(int number[], int key) {
    // int start = 0 , end = number.length-1;

    // for(int i=0;i<number.length;i++){
    // if(number[i] == key){
    // return i;
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // int number[] = {2,4,6,8,10,12,14,16};
    // int key = 10;
    // int index = (Linersearch(number, key));
    // if(index == -1){
    // System.out.println("Not Found");
    // }else{
    // System.out.println("Found at index : " + index);
    // }
    // }

    //Binarysearch
    // public static int Binarysea(int number[], int key) {
    //     int start = 0, end = number.length - 1;
    //     while (start <= end) {
    //         int mid = (start + end) / 2;

    //         if (number[mid] == key) {
    //             return mid;
    //         }else if (number[mid] < key) {
    //             start = mid + 1;
    //         } else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int number[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    //     int key = 7;
    //     System.out.println("Key is at index : "+ Binarysea(number, key));
    // }


    // public static int getlargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest = numbers[i];
    //         }if(smallest>numbers[i]){
    //             smallest = numbers[i];
    //             System.out.println("Smallest number is : " + smallest);
    //         }
    //     }
    //     return largest;
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {1,2,3,4,5,7};
    //     System.out.println("Largest Number is :"+ getlargest(numbers));
    // }
public static int getlargestorsmallest(int number[]) {
    int start = 0, end = number.length-1;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    
    for(int i=0;i<number.length;i++){
        if(largest<number[i]){
            largest = number[i];
        }else if(smallest>number[i]){
            smallest = number[i];

            System.out.println("The smallest Number is :" + smallest);
        }
    }return largest;
}
    public static void main(String[] args) {
        int number[] = {2,4,6,8,1,12,14};
System.out.println("The largest Number is :"+ getlargestorsmallest(number));
    }
}