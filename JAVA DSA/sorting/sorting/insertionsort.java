
package sorting;
import java.util.*;


public class insertionsort{
    public static void printarray(int arr[]){
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
    
}
    }
        
    public static void main(String[] args) {
        int arr[]={2,1,8,5,9};
        for (int i =1 ; i < arr.length; i++) {
         int j=i-1;
         int current = arr[i];
         while (j>=0 &&  current < arr[j]) {
            arr[j+1]=arr[j];
            j--;

            
         }   
         arr[j+1]=current;
        }
printarray(arr);
        

    }

}