package patterns;
import java.util.Scanner;
public class counttraingle{
public static void main(String[] args) {
    Scanner sc =new Scanner((System.in));
    int n=sc.nextInt();
    int couter=1;
    for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
    System.out.print(couter+" ");
    couter++;
}
System.out.println();
    }
}
}