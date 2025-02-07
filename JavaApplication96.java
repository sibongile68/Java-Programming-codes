/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication96;
/**
 *
 * @author Amanda
 */
public class JavaApplication96 {
 
    class Animal{
    void speak(){
    System.out.println("Animal sounds");
    }
    class Dog extends Animal{
   void speak(){
    System.out.println("Bark");
    }
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal= new Dog();
        animal.speak();
        
    }
    
}
