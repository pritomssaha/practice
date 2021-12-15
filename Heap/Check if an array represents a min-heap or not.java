

public class Main
{
	public static void main(String[] args) {
	    int[] A={1, 99, 3,8, 4, 5, 6};
	    if(checkMinHeap(A, 0)){
	        System.out.println("is min heap");   
	    }
	    else{
	        System.out.println("is not min heap"); 
	    }
	}
	
	public static boolean checkMinHeap(int[] A, int index){
	    for (int i=0;i<(A.length)/2 ;i++ ){
	        if((2*i+1<A.length && A[2*i+1]<A[i]) || (2*i+2<A.length && A[2*i+2]<A[i]))
	            return false;
	    } 
	    return true;
	}
}
