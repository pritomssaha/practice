
import java.util.*;

class Node{
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
    }
}


public class Main
{
	public static void main(String[] args) {
	    Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(8);
        root.right.right = new Node(10);
        System.out.println(isHeap(root));
 
	
	}
	
	static int height(Node root){
	    if(root==null)
	        return 0;
	   else
	        return 1+height(root.left)+height(root.right);
	}
	
	static boolean isHeap(Node root){
	    int i=0;
	    return isHeapUtil(root, i, height(root));
	}
	
	static boolean isHeapUtil(Node root, int i, int n){
	    if(root==null)
	        return true;
	   if(i>=n)
	        return false;
	        
	   if((root.left!=null && root.left.data<=root.data) || (root.right!=null && root.right.data<=root.data))
	     return false;
	   return isHeapUtil(root.left, 2*i+1, n) && isHeapUtil(root.right, 2*i+2, n);
	}
    
}
	    