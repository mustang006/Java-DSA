package Bitmanipulation;

public class updatebit {
    // clear bit
    // for zero update
    public static void main(String[] args) {
        int n=5;

        int position=2;
        int bitmas=1<<position;
        int notbitmas=~bitmas;
        int newnumber= notbitmas & n;
        System.out.println(newnumber);






    }
}

