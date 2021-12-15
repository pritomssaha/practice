
class Node{
    Node next;
    int data;
    
    Node(int data){
        this.data=data;
    }
    Node(){}
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}

public class Main{
	public static void main(String[] args) {
	    Node head=null;
	    int[] keys = {1, 2, 5, 3, 4, 4};
	    for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
       // printlist(head);
        
        Node[] nodes = frontBackSplit(head);
 
        // print linked list
        printlist(nodes[0]);
        System.out.println();
        printlist(nodes[1]);
	}
	public static int length(Node head){
	    int count=0;
	    Node current=head;
	    while(current!=null){
	        count++;
	        current=current.next;
	    }
	    return count;
	}
	public static Node[] frontBackSplit(Node head){
	    int len=length(head);
	    Node frontref=null;
	    Node backref=null;
	    
	    if(len<2){
	        frontref=head;
	        return new Node[] {frontref, backref};
	    }
	    
	    Node slow=head;
	    Node fast=head.next;
	    while(fast!=null){
	        fast=fast.next;
	        if(fast!=null){
	            fast=fast.next;
	            slow=slow.next;
	        }
	    }
	    frontref=head;
	    backref=slow.next;
	    slow.next=null;
	    return new Node[] {frontref, backref};
	   
	}
	
	
	
	
	
	public static void printlist(Node head){
	    Node current=head;
	    while(current!=null){
	        System.out.print(current.data+ "->");
	        current=current.next;
	    }
	}
}
