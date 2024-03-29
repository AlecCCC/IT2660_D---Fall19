/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
//Create the class Node.
class Node<T> implements Comparable<T>
{

   private T value;

   private Node<T> nextRef;
  
   //getValue() method.
   public T getValue()
   {

       return value;

   }
  
   //setValue() method.
   public void setValue(T value)
   {

       this.value = value;

   }
  
   //getNextRef() method.
   public Node<T> getNextRef()
   {

       return nextRef;

   }
  
   //setNextRef() method.
   public void setNextRef(Node<T> ref)
   {

       this.nextRef = ref;

   }

   //compareTo() method.
   public int compareTo(T arg)
   {

       if(arg == this.value)
       {

           return 0;

       }
       else
       {

           return 1;

       }

   }

}


public class SinglyLinkedList<T>
{
   //Private data members.
   private Node<T> head;
   private Node<T> tail;
  

   public void add(T element)
   {
       //Create an object.
       Node<T> nd = new Node<T>();
       nd.setValue(element);
      
       System.out.println("Adding: "+element);
      

       if(head == null)
       {
           head = nd;

           tail = nd;

       }
      

       else
       {
           tail.setNextRef(nd);
       }
       tail = nd;

   }

   public void addAfter(T element, T after)
   {
       Node<T> tmp = head;

       Node<T> refNode = null;

       System.out.println("Traversing to all nodes..");
      

       while(true)
       {

           if(tmp == null)
           {
               break;
           }
          
           if(tmp.compareTo(after) == 0)
           {

           refNode = tmp;

           break;

           }

       tmp = tmp.getNextRef();
      
       }
  
  
       if(refNode != null)
       {

           Node<T> nd = new Node<T>();

           nd.setValue(element);

           nd.setNextRef(tmp.getNextRef());

           if(tmp == tail)
           {

               tail = nd;

           }

           tmp.setNextRef(nd);

       }
      
       else
       {

           System.out.println("Unable to find the given element...");

       }

   }
  
   //deleteFront() method to delete an element.
   public void deleteFront()
   {
       //If head node is null.
       if(head == null)
       {

           System.out.println("Underflow...");

       }
      
       Node<T> tmp = head;

       head = tmp.getNextRef();

       if(head == null)
       {

           tail = null;

       }

       System.out.println("Deleted: "+tmp.getValue());

   }
  
   //deleteAfter() method to delete a node after a node.
   public void deleteAfter(T after)
   {

       Node<T> tmp = head;

       Node<T> refNode = null;

       System.out.println("Traversing to all nodes..");

       while(true)
       {

           if(tmp == null)
           {

               break;

           }

           if(tmp.compareTo(after) == 0)
           {

               refNode = tmp;

               break;

           }

           tmp = tmp.getNextRef();

       }

       if(refNode != null)
       {

           tmp = refNode.getNextRef();

           refNode.setNextRef(tmp.getNextRef());

           if(refNode.getNextRef() == null)
           {

               tail = refNode;

           }

           System.out.println("Deleted: "+tmp.getValue());

       }
       else
       {

           System.out.println("Unable to find the given element...");

       }

   }
  
   public void traverse()
   {

       Node<T> tmp = head;

       while(true)
       {

           if(tmp == null)
           {

               break;

           }

           System.out.println(tmp.getValue());

           tmp = tmp.getNextRef();

       }

   }
  

   public static void main(String a[])
   {
       
       SinglyLinkedList<Integer> sl = new SinglyLinkedList<Integer>();

       sl.add(3);

       sl.add(32);

       sl.add(54);

       sl.add(89);
      
       sl.addAfter(76, 54);

       sl.deleteFront();

       sl.deleteAfter(76);

       sl.traverse();

   }

}