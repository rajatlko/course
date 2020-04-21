

import java.util.*;

class LinkedList{
          Node  head;
        static class Node
        {
            Node next;
            int data;
            Node(int d)
            {
                this.data=d;
                Node next=null;
            }
        }
        public static void main(String[] args)
        {
            Scanner scn=new Scanner(System.in);
            LinkedList llist=new LinkedList();
            int lengthOfLinkedlist;
            lengthOfLinkedlist=Integer.parseInt(scn.nextLine());
            if(lengthOfLinkedlist==0)
            System.out.println("");
            else{
                        for(int i=0;i<lengthOfLinkedlist;i++)
                        {
                            if(llist.head==null)
                            {
                                llist.head=new Node(Integer.parseInt(scn.nextLine()));
                            }
                            else{
                                Node temp=llist.head;
                                while(temp.next!=null)
                               {
                                   temp=temp.next;
                               }
                            int p=Integer.parseInt(scn.nextLine());
                            temp.next=new Node(p);
                            temp=temp.next;
                            }
                        }
                           Node n=llist.head;
                            while(n!=null)
                            {
                            System.out.println(n.data);
                            n=n.next;
                            }
                    }
                }
        }

    