//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] arr={2,3,1,7,8,1};
int ans= linearSearch(arr,3);
System.out.println(ans);

    }
// Linear Search
// Linear Search checks each element one by one from the beginning of the array.
// It stops when the target element is found or the entire array is searched.

// Algorithm:
// 1. Start from the first element of the array.
// 2. Compare the current element with the target.
// 3. If they are equal, return the index.
// 4. Otherwise, move to the next element.
// 5. If the target is not found, return -1.

// Time Complexity:
// Best Case: O(1)
// Average Case: O(n)
// Worst Case: O(n)

// Space Complexity:
// O(1)


static int linearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){

            if(arr[i]== target){
                return i;
            }
    }

        return -1;
    }

   }