
public class Main {

	public static int ex14(int[] arr, int i) {
		if (i==0) 
			return arr[0];

		return ex14(arr, i-1)+arr[i];
			
	}

	public static int ex15(int[] arr, int i) {
		if (i==0) {
			if (arr[0]>0)
				return 1;
			else
				return 0;
		}
		if (arr[i] > 0)
			return ex15(arr, i-1)+1;
		else
			return ex15(arr, i-1);

	}
	
	public static int ex16( int[] arr, int n, int i) {
		if (i==0) {
			if (arr[0] == n) 
				return 0;
			else
				return -1;
		}
		if (arr[i] == n)
			return i;
	
		return ex16(arr,n,i-1);
		
	}

	public static boolean ex17(int[]arr, int i) {
		if (i ==0)
			return true;
		
		if (arr[i] >arr[i-1])
			return ex17(arr, i-1);
		else
			return false;
	}


	public static void main(String[] args) {
		
		
				
		
	}
		
			

}
