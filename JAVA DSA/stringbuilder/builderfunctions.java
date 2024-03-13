package stringbuilder;

public class builderfunctions {
    public static void main(String[] args) {
     StringBuilder sb=new StringBuilder("Tony");
     System.out.println(sb);
     System.out.println( sb.charAt(0 ));
    // ch set rna ho to strin me
    sb.setCharAt(0, 'c');
    System.out.println(sb);
    // for inserting

    sb.insert(0, 't');
    System.out.println(sb);
    // for deleting
    // it is no inclusive

    sb.delete(0, 2);
System.out.println(sb);
// aari me jodne  liye
sb.append("gg");
System.out.println(sb);
sb.length();


    }
}
