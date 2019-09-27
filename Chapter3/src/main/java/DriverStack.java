/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
public class DriverStack {
    
    public static void main (String[] args)
    {
    
    Stack s = new Stack(3);
    Listing l;
    Listing l1 = new Listing ("Bill",  "1st Avenue", "123 4567");
    Listing l2 = new Listing ("Alec",  "2nd Avenue", "456 4567");
    Listing l3 = new Listing ("James",  "3rd Avenue", "367 8896");
    Listing l4 = new Listing ("Nico",  "4th Avenue", "322 1156");
    
    System.out.println(s.pop());
    System.out.println(s.push(l1));
    System.out.println(s.push(l2));
    System.out.println(s.push(l3));
    System.out.println(s.push(l4));
    
    System.out.println("\n");
    System.out.println("Top element = " + s.peek());
   
    System.out.println("----------------All listings with one over flow----------------" + "\n");
    
    s.showAll(); //shows listings
    
   System.out.println("----------------Tries to pop the Listing '1'----------------" + "\n");
   
    //Three pop operations
    l = s.pop();
    System.out.println(l.toString());
    
    l = s.pop();
    System.out.println(l.toString());
    
    l = s.pop();
    System.out.println(l.toString());
   
             
    l = s.pop(); //will try to pop an already empty stack, return null
    
    System.out.println(l);
    
    System.out.println("----------------Expanded Stack----------------" + "\n");
    System.out.println(s.pop());
    System.out.println(s.push(l1));
    System.out.println(s.push(l2));
    System.out.println(s.push(l3));
    s.expandStack();
    System.out.println(s.push(l4));
    System.out.println("\n");
    
    s.showAll();
    
    }
    
}