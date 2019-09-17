/**
 * @(#)Fout.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Fout {

    public static void main(String[] args) throws IOException 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Type your file name: ");
    	String fn = sc.next();
    	File jb = new File(fn + ".pmab");
    	
    	Scanner cb = new Scanner(jb);
    	System.out.print(cb.next());
    	
    	
    }
    
    
}