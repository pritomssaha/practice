
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] ints={7, 4, 6, 3, 9, 1};
        int k = 3;
 
        System.out.println("k'th largest array element is " + findKthLargest(ints, k));
	    
	}
	
	public static int findKthLargest(int[] A, int k){
	    
	   PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
	   
	   for(int x:A){
	       pq.add(x);
	   }
	    while(k>1){
	        pq.poll();
	        k--;
	    }
	    return pq.peek();
	}
	
	
}
