//Problem Statement: https://www.geeksforgeeks.org/split-string-java-examples/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SplitString
{
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
       System.out.println("Enter String: ");
       String str = scan.nextLine();
       System.out.println("Enter Regex: ");
       String re = scan.nextLine();
       String[] output = str.split(re.toString());
       System.out.println("Output: ");
       for (String a : output) 
        System.out.println(a); 
        System.out.println("-----------------------");
        String pal_rev = "";
        for (int i = output[1].length() - 1; i >= 0; i--) {
            pal_rev = pal_rev + output[1].charAt(i);
        }
     
       if(output[0].equals(pal_rev)){
           System.out.println("Yowza, Palindrome");
       }
    }

}

