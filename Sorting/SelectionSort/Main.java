import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Selection Sort Algorithm:
        //Find the smallest element in the unsorted part,
        //swap it with the first element of the unsorted part,
        //and repeat until the array is sorted.
int []arr={8,9,6,7,5,4,2,3,1,10};
selectionsort(arr);
System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int []arr){
        for(int i=0;i<arr.length-1;i++){

            int minimum=mine(arr, i);
            swap(arr, i,minimum);
        }
    }
    static int mine( int []arr,int start){
        int mine=start;
        for(int i=start;i<arr.length;i++){
            if(arr[i]<arr[mine]){
                mine=i;
            }
        }
        return mine;}
    static void swap(int []arr, int index, int mine){
        int s=arr[index];
        arr[index]=arr[mine];
        arr[mine]=s;
    }}
