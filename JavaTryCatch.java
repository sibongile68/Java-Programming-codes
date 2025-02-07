/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatrycatch;

/**
 *
 * @author Amanda
 */
public class JavaTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        String str=null;
        
        System.out.println(str.length());
        int i=10;
        int results=i/0;
        System.out.println(results);
           
    }
    catch (NullPointerException e ){
    System.out.println("SOMETHING WENT WORONG"+e);
   
    }
        catch(ArithmeticException e)   { 
            
            System.out.println("ITS RUNNING" +e);
        }
        
        finally{
        System.out.println("Catched up");
        }
    } 
    }   
      
    
