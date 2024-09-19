import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(95);
        list.add(4);
        list.add(5);

        // System.out.println(list);

        // int element = list.get(2);
        // System.out.println(element);

        // list.remove(2);
        // System.out.println(list);

        // list.set(2,10);
        // System.out.println(list);

        // System.out.println(list);
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
            min = Math.min(min,list.get(i));
        }
        System.out.println("Max element =" + max);
        // for(int i =0;i<list.size();i++){
        //     min = Math.min(min,list.get(i));
        // }
        System.out.println("Min element is = "+ min);
    }
}
