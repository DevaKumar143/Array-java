public class Reverse {

    // reverse number
    // public static void reverse(int number[]){
    //     int first =0, last = number.length-1;
    //     while(first<last){
    //         int temp = number[last];
    //         number[last] = number[first];
    //         number[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,4,6,8,10};
    //     reverse(number);
    //     for(int i=0;i<number.length;i++){
    //         System.out.print(number[i] + " ");
    //     }
    // }

    public static void printpaires(int numbers[]){
        int tp =0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,8,10};
        printpaires(numbers);
    }
}
