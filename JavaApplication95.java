/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;
import java.util.Iterator;
import java.util.ArrayList;
/**
 *
 * @author Amanda
 */
public class JavaApplication95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> cars=new ArrayList<String>();
        
       cars.add("BMW");
       cars.add("Tesla");
       cars.add("VW");
       
       System.out.println(cars);
       
       //ITERATOR.
       
       Iterator <String> it=cars.iterator();
       
       System.out.println(it.hasNext());
       
       //WRAPPER CLASSES
       
       Double d=10.30;
       Integer i=10;
       Character R='A';
       
       System.out.println(d);
       System.out.println(i);
       System.out.println(R);
               
        
    }
    
}
