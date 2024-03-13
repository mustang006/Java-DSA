
package STRING;
import java.util.*;

public class spiral2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i <=n-1;i++) {
            for (int j = 0; j <=m-1; j++) {
System.out.print(matrix[i][j]);
                
            }
            System.out.println();
            
        }
int rowstart=0;
int rowend=n-1;
int colstart=0;
int colend=m-1;

while(rowstart<=rowend  && colstart<=colend){
    //1
    for (int col =colstart; col <=colend; col++) {
        System.out.print(matrix[rowstart][col]+" ");
        
    }
    rowstart++;
    //2
    for (int row = rowstart; row <=rowend; row++) {
        System.out.print(matrix[row][colend]+" ");
    }
    colend--;
    //3
    for (int col = colend; col>=colstart; col--) {
        System.out.print(matrix[rowend][col]+" ");
        
    }
    rowend--;
    //4
    for (int row = rowend; row >= rowstart; row--) {
        System.out.print(matrix[row][colstart]+" ");
    }
 
    colstart++;
    System.out.println();
}




    }
}