
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] A={1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
	    int k = 2;
 
        sortKSortedArray(A, k);
        
        for(int x: A){
            System.out.print(x+" ");
        }
	    
	    
	}
	
	public static void sortKSortedArray(int[] A, int k){
	    
	    PriorityQueue<Integer> pq=new PriorityQueue<>();
	    
	    for(int i=0;i<=k;i++){
	        pq.add(A[i]);
	    }
	    
	    int index=0;
	    for(int i=k+1;i<A.length;i++){
	        A[index]=pq.peek();
	        pq.poll();
	        pq.add(A[i]);
	        index++;
	    }
	    Iterator<Integer> itr = pq.iterator();
	    while(itr.hasNext()){
	        A[index]=pq.peek();
	        pq.poll();
	        index++;
	    }
	    
	    
	    
	}
}
