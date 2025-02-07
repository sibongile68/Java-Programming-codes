/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> cars=new ArrayList <String>();
        cars.add("Volvo");
        cars.add("Tesla");
        cars.add("VW");
        
        cars.add(3, "QUASHAI");
  
        System.out.println(cars);
    
    
}}
