/*
 * Array Deletion
 *
 * Definition:
 * Array deletion means removing an element from an array
 * from a specific position or index.
 *
 * Important:
 * Java arrays have a fixed size.
 * Therefore, we cannot reduce the size of an existing array directly.
 *
 * To delete an element, we create a new array with one less
 * position and copy the required elements into it.
 *
 * Steps:
 * 1. Choose the index of the element to delete.
 * 2. Create a new array with one less size.
 * 3. Copy the elements before the deletion index.
 * 4. Skip the element at the deletion index.
 * 5. Shift the remaining elements one position to the left.
 *
 * Time Complexity:
 * - Deletion at the beginning: O(n)
 * - Deletion at a specific index: O(n)
 * - Deletion at the end: O(1) if the size is logically reduced.
 */
public class Main {
    public static void main(String[] args) {


        // Original array
        int[] numbers = {10, 20, 30, 40, 50};

        // Index of the element we want to delete
        int deleteIndex = 2;

        // Create a new array with one less position
        int[] newArray = new int[numbers.length - 1];

        /*
         * Copy elements from the original array.
         *
         * Elements before the deletion index
         * remain at the same index.
         *
         * Elements after the deletion index
         * are shifted one position to the left.
         */
        for (int i = 0; i < newArray.length; i++) {

            if (i < deleteIndex) {
                newArray[i] = numbers[i];
            } else {
                newArray[i] = numbers[i + 1];
            }
        }

        // Print the array after deletion
        System.out.println("Array after deletion:");

        for (int number : newArray) {
            System.out.print(number + " ");
        }
    }
}
