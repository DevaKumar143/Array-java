import java.util.*;
public class Mideleadd {
    public static int sumofmiddle(int[] arr1, int[] arr2){
        int n = arr1.length;
        int ind1 = 0, ind2 = 0;
        // int sum = 0;
        int x = 0;
        int[] arr = new int[n+1];

        for(int i=0;i<=n;i++){
            while(ind1 <=n && ind2<=n && x<=n){
                if(arr1[ind1] <= arr2[ind2]){
                    arr[x++] = arr2[ind1++];
                }else{
                    arr[x++] = arr2[ind2++];
                } 
            }
        }
        return arr[n-1]+ arr[n];
    }

    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {4,5,6,7,9,11};

        System.out.print(sumofmiddle(arr1, arr2));
    }
}
