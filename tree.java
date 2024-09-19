import java.util.*;

// public class tree{
//     public static void bubblesort(int arr[]){
//         for(int turn = 0;turn<arr.length-1;turn++){
//             for(int j =0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,2,3};
//         bubblesort(arr);
//         printArr(arr);
//     }
// }

// public class tree{
//     public static void bubblesort(int arr[]){
//         for(int i =0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int k = 0;k<arr.length;k++){
//             System.out.print(arr[k] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         bubblesort(arr);
//         printArr(arr);
//     }
// }

// Selection Sort
// public class tree{
//     public static void SelectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minpos = i;
//             for(int j = i+1;j<arr.length;j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos = j;
//                 }
//             }
//             //swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         SelectionSort(arr);
//         printArr(arr);
//     }
// }

//Insertion SOrt

// public class tree{
//     public static void insertionSort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;

//             while(prev>=0 && arr[prev]> curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         insertionSort(arr);
//         printArr(arr);
//     }
// }

// public class tree{
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.print(" a ="+ a);
//         System.out.print(" b ="+ b);
//     }
//     public static void main(String args[]){
//         int a = 5;
//         int b = 10;
//         swap(a,b);
//     }
// }

// public class tree{
//     public static int factorial(int n){
//         int f = 1;
//         for(int i=1;i<=n;i++){
//             f = f*i;
//         }
//         return f;
//     }
//     public static int binCoeff(int n , int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n/ (fact_r*fact_nmr);
//         return binCoeff;
//     }
//     public static void main(String args[]){
//         // System.out.print(factorial(5));
//         System.out.println(binCoeff(5, 2));
//     }
// }

// public class tree{
//     public static int sum(int a , int b){
//         return a+b;
//     }
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(5, 2, 1));
//     }
// }

// public class tree{
//     public static int sum(int a ,int b){
//         return a+b;
//     }
//     public static float sum(float a, float b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3.2f, 4.8f));
//     }
// }

// Java program to Convert characters
// of a string to opposite case
// class tree {

// 	// Method to convert characters
// 	// of a string to opposite case
// 	static void convertOpposite(StringBuffer str)
// 	{
// 		int ln = str.length();

// 		// Conversion using predefined methods
// 		for (int i = 0; i < ln; i++) {
// 			Character c = str.charAt(i);
// 			if (Character.isLowerCase(c))
// 				str.replace(i, i + 1,
// 							Character.toUpperCase(c) + "");
// 			else
// 				str.replace(i, i + 1,
// 							Character.toLowerCase(c) + "");
// 		}
// 	}

// 	public static void main(String[] args)
// 	{
// 		StringBuffer str
// 			= new StringBuffer("Hello World");
// 		// Calling the Method
// 		convertOpposite(str);

// 		System.out.println(str);
// 	}
// }

// class tree{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;

// 		Node (int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static int preorder(Node root){
// 		if(root == null){
// 			return 0;
// 		}
// 		System.out.println(root.data+" ");
// 		preorder(root.left);
// 		preorder(root.right);
// 	}
// 	public static void main(String[] args) {
//        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

// 	}
// }

// height of tree

// public class tree {
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;

// 		public Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static int height(Node root) {
// 		if(root ==null){
// 			return 0;
// 		}
// 		int lh = height(root.left);
// 		int rh = height(root.right);

// 		return Math.max(lh, rh)+1;

// 	}
// 	public static void main(String args[]) {
//       Node root = new Node(1);
// 	  root.left = new Node(2);
// 	  root.right = new Node(3);
// 	  root.left.left = new Node(4);
// 	  root.left.right = new Node(5);
// 	  root.right.left = new Node(6);
// 	  root.right.right = new Node(7);

// 	  System.out.println(height(root));
// 	}
// }

// count of tree
public class tree {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static int count(Node root) {
		if(root == null){
			return 0;
		}
		int leftcount = count(root.left);
		int rightcount = count(root.right);
		return leftcount+rightcount+root.data;
	}

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println(count(root));
	}
}
