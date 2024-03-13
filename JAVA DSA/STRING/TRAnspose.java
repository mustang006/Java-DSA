package STRING;

import java.util.*;

public class TRAnspose {
    ;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("The transpose is : ");
        // To print transpose
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
