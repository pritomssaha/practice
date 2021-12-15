
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
    
    static Node insert(Node root, int key){
        if(root==null)
            return new Node(key);
        else if (root.data>key){
            root.left=insert(root.left, key);
        }
        else {
            root.right=insert(root.right, key);
        }
        return root;
    }
    
    static boolean findkey(Node root, int key){
        if(root==null)
            return false;
        else{
            if(root.data==key)
                return true;
            else if(root.data>key)
                return findkey(root.left, key);
            else
                return findkey(root.right, key);
        }
        
    }
    
    public static Node constructBST(int[] keys){
        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
        return root;
    }
    
	public static void main(String[] args) {
	     int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
 
        Node root = constructBST(keys);
        inorder(root);
        System.out.println(findkey(root,50));
	
	}
}
