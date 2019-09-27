/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
public class Stack 
{
    private Listing[] data;
    private int top;
    private int size;
    
    public Stack()
    {
        top = -1;
        size = 3;
        data = new Listing[3];
    }
    public Stack (int n)
    {
       top = -1;
        size = n;
        data = new Listing[n];
    }
    
    public void settop()
            
    {
     top=-1;
    }
    
    
    public boolean push(Listing newNode)
    {
        if(top == size - 1)
            return false; //overflow 
        else 
        {

            top = top + 1; 
            data[top] = newNode.deepCopy();
            return true;
        }
    }
    
    public Listing pop()
    {
        int topLocation;
        if(top == -1)
            
            return null; //underflow error
        else
        {
         topLocation = top;
         top = top - 1;
         return data[topLocation];
        
        }
    }
    
    public void showAll()
    {
     for (int i = top; i >= 0; i--)
     System.out.println(data[i].toString());
    
    }
    
    public void initialStack()  
    {
     top = -1;
    }
    
    public boolean StackEmpty()
            
    {
        if(top == -1)
            return true;
        else
            return false;
    
    }
    
    public boolean StackFull()
            
    {
        if(top == size-1)
            return true;
        else
            return false;
    
    }
    
    public Listing peek()

     {

          if(StackEmpty())

          {

              System.out.println("Stack is underflow");

              return null;

          }

          else

          {

              return data[top];

          }

     }
    
    
     public void expandStack()

     {

          Listing[] buff;

          buff=new Listing[size*2];

          for(int i=0;i<size;i++)

          {

              buff[i]=data[i];

          }

          size=size*2;

          data=buff;

     }
    
    
}
