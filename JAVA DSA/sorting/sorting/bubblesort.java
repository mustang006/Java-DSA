package sorting;
import java.util.*;
public class bubblesort {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 2, 6, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        printarray(arr);
    }

 {
    
}
}