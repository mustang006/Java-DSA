package stringbuilder;
import java.util.*;


public class reversestring {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abhishe");
        //for reversing the string
        
        for (int i = 0; i < sb.length()/2; i++) {
            int front =i;
            int bac=sb.length()-i-1;

            char frontchar=sb.charAt(front);
            char bacchar=sb.charAt(bac);
             
            sb.setCharAt(front, bacchar);
            sb.setCharAt(bac,frontchar);
        }
        System.out.println(sb);

    }
}
