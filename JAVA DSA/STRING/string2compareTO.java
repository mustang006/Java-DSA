package STRING;
//

//.compareTo  function program
public class string2compareTO {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        /// compareTo

        // s1>s2 :+ive value
        // s1<s2 :-ive value
        // s1==s2 :0 value
        //

        // aaheloo ,, aaceloo

        if (name1.compareTo(name2) == 0) {
            System.out.println("Both string are equal");
        } else {
            System.out.println("String are not equal");
        }

        // Because == this operator doesnt worin many conditions that,s why we use
        // this .campareTo function

        if (new String("Tony") == new String("Tony")) {
            System.out.println(" STring are equal");
        } else {
            System.out.println("string are not equal");
        }
        //

    }

}
