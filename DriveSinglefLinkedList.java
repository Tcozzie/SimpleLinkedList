/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivesingleflinkedlist;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hunter
 */
public class DriveSinglefLinkedList {

    /**
     * Create a doubly linked list
     * fix the add add a node method
     * fix the search method
     * Add a node to the front
     * add nodes in order (new method)
     * print the list
     * delete a node 
     * print the list
     * Discuss circular lists
     * Printing the list backwards
     */
    
    public static void main(String[] args) 
    {    
        final int TOTAL = 5;
        LinkedList ll = new LinkedList();
        int i;
        Random rand = new Random();
        for(i =0; i<TOTAL; i++)
        {
            int x = rand.nextInt(100);
            ll.add(x);
            
        } 
        
        //for(int j =i; j<TOTAL+TOTAL; j++)
        //{
            //ll.addToBack(new Node(j));
        //}
        ll.print();
        ll.printBackwards();
        Scanner console = new Scanner(System.in);
        //System.out.println("What number would you like to search for?");
        //int num=console.nextInt();
        //ll.search(num);
        System.out.println("What number would you like to delete?");
        int num=console.nextInt();
        ll.deleteNode(num);
        ll.print();
        /*System.out.println("What to delete?");
        int num =  console.nextInt();
        ll.deleteNode(num);
        ll.print();
        System.out.println("What to delete?");
        num =  console.nextInt();
        ll.deleteNode(num);
        ll.print();
        System.out.println("What to delete?");
        num =  console.nextInt();
        ll.deleteNode(num);
        ll.print(); */
    
    }
}
