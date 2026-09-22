import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] arr={3,5,6,1,2,4};
cyclicSort(arr);
System.out.println(Arrays.toString(arr));
    }


    static void cyclicSort(int [] arr){
        /*
         * Cyclic Sort
         *
         * Sorts an array containing numbers from 1 to n.
         *
         * Main idea:
         * Each value is placed at its correct index.
         *
         * Correct Index = value - 1
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        // start from checking from 0
        int i=0;
        // Continue until every element is at correct index
        while (i<arr.length){
            // find the correct index of the current element
            int correctIndex=arr[i]-1;
            // if the element is not at its correct index, swap it
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                // Move to the next index when the current element is correct
                i++;
            }
        }

    }
}