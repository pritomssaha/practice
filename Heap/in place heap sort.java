
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] A={7, 4, 6, 3, 9, 1};
	    
 
        heapSort(A);
        for(int x:A)
            System.out.println(x);
	    
	    
	}
	
	public static void heapSort(int[] A){
	    int n=A.length;
	    
	    for(int i=A.length/2;i>=0;i--){
	        heapify(A, i, n);
	    }
	    
	    
	    
	    while(n>0){
	        A[n-1]=pop(A,n);
	        n--;
	    }
	    
	}
	
	public static int pop(int[] A, int n){
	    int top=A[0];
	    A[0]=A[n-1];
	    heapify(A,0,n);
	    return top;
	}
	
	public static void heapify(int[] A, int i, int n){
	    int left=2*i+1;
	    int right=2*i+2;
	    int smallest=i;
	    if(left<n && A[left]<A[smallest])
	        smallest=left;
	   if(right<n && A[right]<A[smallest])
	       smallest=right;
	       
	   if(smallest!=i){
	       int temp=A[smallest];
	       A[smallest]=A[i];
	       A[i]=temp;
	       heapify(A, smallest,n);
	   }
	}
	
    		
    	
		
	
	
}
