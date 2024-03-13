package Bitmanipulation;

import java.nio.channels.NetworkChannel;

public class setbit {
    public static void main(String[] args) {
        // 0101
        int n=5;
        int position=1;
    
        int bitmas=1<<position;
    
    int newnumber=bitmas | n;
    System.out.println(newnumber);
        }
    }

