package Arrays;

import java.util.Scanner;

public class minandmaxarrayterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

//example 1,2,3,4,5


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("The maximum value is :-"+max);
        System.out.println("The minimum value is :-"+min);

    }
}
