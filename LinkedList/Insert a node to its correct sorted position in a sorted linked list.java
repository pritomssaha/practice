
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
	    int[] keys = {2, 4, 6, 8};
	    for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        printlist(head);
        head= sortedInsert(head, new Node(10));
        System.out.println();
        printlist(head);
        
		
	}
	
	public static Node sortedInsert(Node head, Node newNode){
	    
	    //if the list is empty or the 1st element is >= newNode data
	    if(head==null || head.data>=newNode.data){
	        newNode.next=head;
	        head=newNode;
	        return head;
	    }
	    Node current=head;
	    while(current.next!=null && current.next.data<=newNode.data){
	        current=current.next;
	    }
	    newNode.next=current.next;
	    current.next=newNode;
	    return head;
	    
	    
	    
	}
	
	public static void printlist(Node head){
	    Node current=head;
	    while(current!=null){
	        System.out.print(current.data+ "->");
	        current=current.next;
	    }
	}
}
