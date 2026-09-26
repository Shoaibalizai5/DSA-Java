//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        1. Array Definition :
        A array is a data structure that store multiple values of the same data type
        in fixed-size collection.
        each element is access using an index .
        Array indexing starts from 0 in java.

      2. Arrays type:
       there are two types of array
       1.One-Dimensional Array
       2. Multi- Dimensional Array
         .
 */


                // 3. Declare and initialize an array of One-Dimensional Array

                int[] numbers = {10, 20, 30, 40, 50};

        // 4. Declare and initialize an array of One-Dimensional Array
        int[] []numbers2 = {{1,3},{4,5},{6,7}};

                // 5. Access an element using its index -One-Dimensional Array.
                System.out.println("First element: " + numbers[0]);
                System.out.println("Third element: " + numbers[2]);

        // 6. Access an element using its index -One-Dimensional Array.
        System.out.println(numbers2[0][0]);
        System.out.println(numbers2[1][1]);

                // 7. Update an element at  one Dimensional array
                numbers[2] = 35;

                System.out.println("Updated third element: " + numbers[2]);
                //8. Update an  element of Multi-dimensional array
        numbers2[1][1]=30;
        System.out.println("Update of an element at multi-dimensional arrays : "+ numbers2[1][1]);
                // 9. Traverse the One-Dimensional array using a for loop
                System.out.println("One-Dimensional Array elements:");

                for (int i = 0; i <numbers.length; i++) {
                    System.out.println(numbers[i]);
                }

        // 10. Traverse the Multi-Dimensional array using a for loop using nested for loop
        System.out.println("Multi-Dimensional  Array elements:");

        for (int i = 0; i < 2; i++) {

            for(int j=0;j<2;j++){
                System.out.println(numbers2[j][i]);
            }
        }

                // 11. Find the sum of all elements
                int sum = 0;

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }

                System.out.println("\nSum: " + sum);

                // 12. Find the largest element
                int largest = numbers[0];

                for (int i = 1; i < numbers.length; i++) {

                    if (numbers[i] > largest) {
                        largest = numbers[i];
                    }
                }

                System.out.println("Largest element: " + largest);

                // 13. Find the smallest element
                int smallest = numbers[0];

                for (int i = 1; i < numbers.length; i++) {

                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }

                System.out.println("Smallest element: " + smallest);
            }
        }
