package Arrays;

import java.util.Scanner;

public class arrayascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        boolean isascending= true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

isascending=false;
            }

        }
        if (isascending) {
            System.out.println("The array is in ascending order");
        }
        else{
            System.out.println("The array is in not in ascending form");
        }
    }
}
