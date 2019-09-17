/**
 * @(#)Fin.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */
 
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin {

    public static void main(String []args) throws IOException
    {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Type your file name: ");
    	String fn = sc.next();
    	FileWriter pao = new FileWriter(fn + ".pmab");
    	System.out.print("Input your text: ");
    	String text = sc.next();
    	pao.write(text);
    	pao.close();
    	
    }
    
    
}