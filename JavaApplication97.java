/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication97;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 *
 * @author Amanda
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Pattern p=Pattern.compile("amanda");
     Matcher m=p.matcher("^a.$a");
     
     boolean b=Pattern.matches("123", "/d{3}");
     System.out.println(b);
     
    }
    
}
