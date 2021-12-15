
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] A={7, 4, 6, 3, 9, 1};
	    int k = 3;
 
        System.out.print(findKthSmallest(A, k));
	    
	    
	}
	
	public static int findKthSmallest(int[] A, int k){
	    
	    //create min heap
	    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));
	    
	    for(int x: A){
	        pq.add(x);
	    }
	    //kth smallest number is kth node
	    while(k>1){
	        pq.poll();
	        k--;
	    }
	    return pq.peek();
	    
	    
	    
	    
	    
	}
}
