package Functions;

import java.util.*;

public class function2 {
    public static int calculatemul(int a, int b) {
int mul=a*b;
return mul;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("the multiply of 2 no is :- "+calculatemul(a, b));

}
    
}
