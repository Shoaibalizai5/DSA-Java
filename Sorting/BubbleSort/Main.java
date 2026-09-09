import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
int [] arr={9,8,6,7,5,4,2,3,1,10};
bubbleSort(arr);
System.out.println(Arrays.toString(arr));
    }
    // Bubble Sort Algorithm
    //Compare adjacent elements and swap them if they are in the wrong order.
    //After each pass, the largest unsorted element moves ot the end.
    // Time Complexity:
    // Best Case: O(n²)
    // Average Case: O(n²)
    // Worst Case: O(n²)
    //
    // Space Complexity: O(1)
    // In-place sorting algorithm.

     static void bubbleSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
     }
}