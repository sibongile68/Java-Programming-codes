/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

/**
 *
 * @author Amanda
 */
public class JavaApplication100 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        try{
        int arr[]={1,2,3,4};
        System.out.println(arr[5]);
        
          }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("OHKAY COOL");
        
    }
    }
        
    
    
    
}