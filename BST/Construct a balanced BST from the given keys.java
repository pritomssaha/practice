import java.util.*;
public class Main{
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
        }
        
    }
    
    Node root=null;
    
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
  
    
    public static Node convert(int[] keys){
        Arrays.sort(keys);
        return convert(keys, 0, keys.length-1,null);
    }
    
    static Node convert(int[] keys, int low, int high, Node root){
        if(high<low)
            return root;
        int mid=low+(high-low)/2;
        root=new Node(keys[mid]);
        root.left=convert(keys, low, mid-1,root.left);
        root.right=convert(keys, mid+1, high,root.right);
        return root;
        
    }
    
    
    
	public static void main(String[] args) {
	     int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
	     Node root = convert(keys);
	     inorder(root);
	
	}
}
