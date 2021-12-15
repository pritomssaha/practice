//convert min heap to max heap
public class Main{
	public static void main(String[] args) {
	    //int[] A={9, 4, 7, 1, -2, 6, 5};
	    int[] A={-2, 1, 5, 9, 4, 6, 7};
	    convertToMinHeap(A);
	    for(int x: A){
	        System.out.print(x+", ");
	    }
	}
	
	public static void convertToMinHeap(int[] A){
	    int i=(A.length)/2;
	    while(i>=0){
	        heapify(A, i--, A.length);
	    }
	}
	
	private static void heapify(int[] A, int i, int n){
	    int left=left(i);
	    int right=right(i);
	    int largest=i;
	    if(left<n && A[left]>A[largest])
	        largest=left;
	    if(right<n && A[right]>A[largest])
	        largest=right;
	   if(largest!=i){
	       swap(A, largest,i);
	       heapify(A , largest, n);
	   }
	        
	}
	
	
	private static int left(int i){
	    return (2*i+1);
	} 
	private static int right(int i){
	    return (2*i+2);
	} 
	
	private static void swap(int[] A, int i,int j){
	    int temp=A[i];
	    A[i]=A[j];
	    A[j]=temp;
	}
	
}
