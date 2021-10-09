/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Machine
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    double r,result=0;
    JavaApplication1()
    {
     r=0.0;
    }
   public void  print()
            
    {
    System.out.println("a");
    //Scanner sc=new Scanner(System.in);
    //r=sc.nextDouble();
    }
   public void print(String str){
  //result= 3.14*r*r;
   System.out.println("b");
   }
   public void print(int x)
   {
   System.out.println("c");
   }
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication1 j=new JavaApplication1();
            //j.input();
            //j.show();
        j.print(12);
    }
    
}
