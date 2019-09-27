/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
public class Listing {
    private String name;
    private String address;
    private String number;
    
    public Listing()
    {
    
        name = "";
        address = "";
        number = "";
    
    }
    
    public Listing (String n, String a, String num)
    {
        name = n;
        address = a;
        number = num;
    }
    
    public String toString()
    {
     return ("Name is " + name + "\n" +
             "Address is " + address + "\n" +
             "Number is " + number + "\n");

    }
    
    public Listing deepCopy()
    {
    
        Listing clone = new Listing(name, address, number);
        return clone;
    
    }
    
}
