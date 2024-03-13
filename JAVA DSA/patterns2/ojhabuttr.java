package patterns2;
// import java.util.*;

import java.util.Scanner;

public class ojhabuttr {
    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
