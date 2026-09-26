//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] arr={3,4,5,6,7,8};
 int ans=binarySearch(arr,0,arr.length-1,7);
 System.out.println(ans);
    }

    /*
     * Binary Search Algorithm
     *
     * Binary Search is used to find an element in a sorted array.
     * It repeatedly divides the search range into two halves.
     *
     * Steps:
     * 1. Find the middle element.
     * 2. If it matches the target, return its index.
     * 3. If the target is smaller, search the left half.
     * 4. If the target is larger, search the right half.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     *
     * Note: The array must be sorted.
     */
    static int binarySearch(int [] arr,int start,int end ,int target){


    while (start<=end){
        int med=start+(end-start)/2;
        if(arr[med]==target){
            return med;
        }else  if(arr[med]>target){
        start=0;
        end=med-1;
        }else {
            start=med+1;
            end=arr.length-1;
        }
    }
    return -1;

    }
}