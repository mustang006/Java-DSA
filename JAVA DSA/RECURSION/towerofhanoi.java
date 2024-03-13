
package RECURSION;

public class towerofhanoi {
    public static void Towerofhanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer dis "+ n +" from "+ src+ " "+ dest);
            return; 
        }

        Towerofhanoi(n-1, src, dest, helper);
        System.out.println("transfer dis"+ n +" from "+ src+ " to "+ dest );
        Towerofhanoi(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        int n=3;
        Towerofhanoi(n,"S" ,"H","D");
    }    
    
}
