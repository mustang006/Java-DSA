package patterns2;
import java.util.*;

import javax.xml.transform.Source;


public class ojha2 {
    public static void main(String[] args) {
        System.out.print("Enter thr number:  ");
       Scanner Sc=new Scanner(System.in);
            int n=Sc.nextInt();
            int number=1;
            for(int i=1;i<=n;i++){
                
                for(int j=1;j<=n;j++){
                  if(i){
                    System.out.print(i+" ");
                  }
                   else{
                    System.out.print(j+" ");
                   }
                   
                }
                System.out.println();
            }
        }


    }
    

