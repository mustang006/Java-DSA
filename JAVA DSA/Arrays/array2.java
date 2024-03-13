package Arrays;

import java.util.Scanner;

public class array2 {
 [] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int [5];
        for (int i = 0; i < arr.length; i++) {
             arr[i]=sc.nextInt();

        }
        System.out.println("print the value of x");
        int x =sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (x==arr[j]){

            
            System.out.println(j);
        }
    }
}
}