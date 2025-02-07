/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Amanda
 */
public class regEx {
int x,y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Pattern p=Pattern.compile("test123");
         Matcher M=p.matcher("\\D");
         boolean b=Pattern.matches("test123","\\D");
         System.out.println(b);
        
         
         
         int x=10;
         double d=x;
         System.out.println(d);
    }
    
}
