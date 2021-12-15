
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
	    int[] keys = {1, 2, 2, 2, 3, 4, 4, 5};
	    for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        printlist(head);
        head= removeDuplicates(head);
        System.out.println();
        printlist(head);
		
	}
	
	public static Node removeDuplicates(Node head){
	    Node current =head;
	    while(current.next!=null){
	        if(current.data==current.next.data){
	            current.next=current.next.next;
	        }
	        else{
	            current=current.next;
	        }
	    }
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
