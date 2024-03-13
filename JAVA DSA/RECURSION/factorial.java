package RECURSION;

public class factorial {
    public static int calcfactorial(int n) {
        if (n==1 || n==0) {
            return 1;
            
        }
        int factorialNM1 =calcfactorial(n-1);
        int factorial=n*factorialNM1;
        return factorial;
        
    }
    public static void main(String[] args) {
        int n=5;
        int ans =calcfactorial(n);
System.out.println(ans);
        
    }
}
