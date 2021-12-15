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
	    int n = 5;
        Node head = null;
        for (int i = n; i > 0; i--) {
            head = push(head, i);
        }
 
        // insert cycle
        head.next.next.next.next.next = head.next;
 
        removeCycle(head);
        printList(head);
        
		
	}
	
	 public static Node push(Node head, int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
    
    public static void removeCycle(Node head){
        Node prev=null;
        Node current=head;
        Set<Node> set=new HashSet<>();
        while(current!=null){
            if(set.contains(current)){
                prev.next=null;
                return;
            }
            else
                set.add(current);
            
            prev=current;
            current=current.next;
        }    
    }
	
	
	public static void printList(Node head){
	    Node current=head;
	    while(current!=null){
	        System.out.print(current.data+ "->");
	        current=current.next;
	    }
	}
}
