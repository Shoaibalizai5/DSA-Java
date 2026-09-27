//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         * Array Insertion
         *
         *
         * Definition:
         * Array insertion means adding a new element to an array
         * at a specific position or index.
         *
         * Important:
         * Java arrays have a fixed size. Therefore, we cannot
         * increase the size of an existing array directly.
         *
         * To insert a new element, we usually create a new array
         * with a larger size and shift the required elements.
         *
         * Time Complexity:
         * - Insertion at the beginning: O(n)
         * - Insertion at a specific index: O(n)
         * - Insertion at the end: O(1) if space is already available
         */
                // Original array
                int[] numbers = {10, 20, 30, 40, 50};
                System.out.println("Arrays before insertion.");
        for (int number :numbers) {
            System.out.print(number + " ");
        }

                // Value we want to insert
                int value = 25;

                // Index where we want to insert the value
                int index = 2;

                // Create a new array with one extra space
                int[] newArray = new int[numbers.length + 1];

                /*
                 * Copy elements from the original array.
                 *
                 * If the current index is before the insertion position,
                 * copy the element to the same index.
                 *
                 * Otherwise, move the element one position to the right.
                 */
                for (int i = 0; i < newArray.length; i++) {

                    if (i < index) {
                        newArray[i] = numbers[i];
                    }
                    else if (i == index) {
                        newArray[i] = value;
                    }
                    else {
                        newArray[i] = numbers[i - 1];
                    }
                }

                System.out.println();
                // Print the array after insertion
                System.out.println("Array after insertion:");

                for (int number : newArray) {
                    System.out.print(number + " ");
                }
            }
        }


