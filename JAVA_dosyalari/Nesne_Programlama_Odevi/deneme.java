import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class deneme {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        
        
    }
    
    public static Integer sum(Integer[] ints){
  
        int sum = 0;
        
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }

        return sum;
    }
    
    public static String sum(String[] str){
        
        String sum = "";
        
        for (int i = 0; i < str.length; i ++){
            sum += str[i];
            
        }
        
        return sum;
    }
}