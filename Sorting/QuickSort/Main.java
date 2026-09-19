import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
int []arr={3,2,4,1,0};
quickSort(arr,0,arr.length-1);
System.out.println(Arrays.toString(arr));
    }

    // Quick Sort Algorithm
// Select a pivot element and partition the array around it.
// Elements smaller than the pivot are moved to the left.
// while  elements greater than the pivot moved to  the right.
// Recursively apply the same process to both subarrays.
// Time Complexity:
// Best Case: O(n log n)
// Average Case: O(n log n)
// Worst Case: O(n²)
// Space Complexity:
// Average Case: O(log n)
// Worst Case: O(n)
// In-place sorting algorithm.
    static void quickSort(int  [] arr, int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}