import java.util.HashSet;
import java.util.Set;

// A Linked List Node
class Node
{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}

class Main
{
	// Helper function to print a given linked list
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null)
		{
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}

	// Function to remove duplicates from a sorted list
	public static Node removeDuplicates(Node head){
		
		Node current=head;
		Node prev=null;
		Set<Integer> set=new HashSet<>();
		while(current!=null){
			if(set.contains(current.data)){
				prev.next=current.next;
			}
			else{
				set.add(current.data);
				prev=current;
			
			}
			current=current.next;
		}
		return head;
		
		
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = {5, 3, 4,8, 2, 5, 4, 1, 3,5,8,5,2};

		// points to the head node of the linked list
		Node head = null;

		// construct a linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		removeDuplicates(head);

		// print linked list
		printList(head);
	}
}