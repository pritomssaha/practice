import java.util.*;
class Node{
    Node next;
    int data;
    
    Node(){}
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}

public class Main{
	public static void main(String[] args) {
	    int[] keys = {6, 3, 4, 8, 2, 9};
        Node head = null;
        
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        head = insertSort(head);
 
        // print linked list
        printList(head);
        
		
	}
	public static Node insertSort(Node head){
	    Node current=head;
	    Node result=null;
	    while(current!=null){
	        Node next=current.next;
	        result=sortedInsert(result,current);
	        current=next;
	    }
	    return result;
	}
	
	public static Node sortedInsert(Node head, Node newNode){
	    Node dummy=new Node();
	    Node current=dummy;
	    dummy.next=head;
	    while(current.next!=null && current.next.data<newNode.data){
	        current=current.next;
	    }
	    newNode.next=current.next;
	    current.next=newNode;
	    return dummy.next;
	
}
    
    
	
	public static void printList(Node head){
	    Node current=head;
	    while(current!=null){
	        System.out.print(current.data+ "->");
	        current=current.next;
	    }
	}
}
