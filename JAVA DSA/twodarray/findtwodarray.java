package twodarray;

import java.util.*;

public class findtwodarray {
    



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        

        int matrix[][]=new int [row][col];
// input
for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();

            }
            
        }
        System.out.println("enter the value of x");
        int x=sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                if (x==matrix[i][j]) {
                    System.out.println("THE valur of the inices is :-"+" "+i+" "+j);
                    
                }
                
            }
        }
    
        
        }
    }


