/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivesingleflinkedlist;

/**
 *
 * @author Hunter
 */
public class LinkedList 
{
      private Node first;
      private Node last;
      
      LinkedList(){}
      
      public void add(int x){
          Node temp=new Node(x);
          
          if(first==null){
              temp.setNext(temp);
              temp.setPrev(temp);
              last=temp;
          }else{
              temp.setNext(first);
              temp.setPrev(last);
              first.setPrev(temp);
              last.setNext(temp);
          }
          first=temp;
      }
      
      public void printBackwards(){
          Node check=last;
          System.out.println("***********");
          while(check!=first){
              System.out.println(check);
              check=check.getPrev();
          }
          System.out.println(check);
      }
      
      public void search(int x){
          Node count=first;
          Boolean test=false;
          while(count!=last){
                  count=count.getNext();
                  if(x==count.getData()){
                      System.out.println(x+" is in the data set");
                      test=true;
                  }
          }
          if(x==first.getData()){
              System.out.println(x+" is in the data set");
          }else if (test==false){
              System.out.println(x+" is not in the data set");
                  }
              }
      
      public void deleteNode(int x){
          Node temp=first;
          
          if(temp==null){
              return;
          }
          if(temp.getData()==x){
              first.getNext().setPrev(last);
              last.setNext(temp.getNext());
              first=temp.getNext();
              return;
          }else{
              temp=temp.getNext();
          }
          while(temp!=last){
              if(temp.getData()==x){
                  temp.getPrev().setNext(temp.getNext());
                  temp.getNext().setPrev(temp.getPrev());
                  return;
              }
              temp=temp.getNext();
              }
          
          if(temp==last && temp.getData()==x){
              temp.getPrev().setNext(first);
              temp.getNext().setPrev(temp.getPrev());
              last=temp.getPrev();
              return;
          }
      }
          
      
      
      public void print(){
          Node temp=first;
          if(temp==null){
              return;
          }
          while(temp!=last){
              System.out.println(temp.getData());
              temp=temp.getNext();
          }
          System.out.println(temp.getData());
      }
      
      
      
}
