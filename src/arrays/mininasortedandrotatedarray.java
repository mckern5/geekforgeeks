package arrays;


//Day 29

public class mininasortedandrotatedarray {
	
	static int findmin(int[] arr) {
		
		int min=arr[0];  //assume 1st entry in min
		
		for(int i=1;i<arr.length;i++) {
		    
		    if(arr[i]<min && arr[i]>0) {
		    	min=arr[i];
		    }
		    
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {5,6,1,2,3,4};
        System.out.println(findmin(arr));
        System.out.println("");
        
        int[] arr2= {3,1,2};
        System.out.println(findmin(arr2));
        System.out.println("");
        
        int[] arr3= {4,2,3};
        System.out.println(findmin(arr3));
        System.out.println("");
        
	}

}
