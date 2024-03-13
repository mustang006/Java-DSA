package Arrays;
import java.util.*;
public class arryhomewor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String name[]=new String[size];
       for (int i = 0; i < name.length; i++) {
        name[i]=sc.next();
        
       }
       for (int j = 0; j < name.length; j++) {
        System.out.println(j+1+"name is :-"+name[j]);
        
       }



    }
}