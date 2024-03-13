
package Bitmanipulation;
import java.util.*;
public class getbit {
    public static void main(String[] args) {
    int n=5;
    int position=3;

    int bitmas=1<<position;

if ((bitmas & n )==0) {
    System.out.println(" The no was zero");
}
else{
    System.out.println(" The no was one");
}
    }
}
