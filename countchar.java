import java.util.*;
class Main {
    public static void main(String[] args) {
        String a="MAHAMOOD";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
       System.out.println(Arrays.toString(c));
       String a1="dharshan";
       int c1[]=new int[26];
       for(int i=0;i<a.length();i++)
       {
        c1[((int)(a1.charAt(i)))-97]++;
       }
       System.out.println(Arrays.toString(c1));
    }
}