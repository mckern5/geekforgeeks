package arrays;

import java.util.Arrays;


//Day2

//move all 0s to end
public class moveallzerostoend {
 
	
	//move all nonzero to temp, fill rest 0, send back temp
	static int[] movetoend(int[] arr) {
						
		int[] temp= new int[arr.length];
		Arrays.fill(temp, 0);    //fill method of Arrays class  had to look this up
		
		int j=0;
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {				
				temp[j]=arr[i];
		        j++;
			}
			
		}
		return temp;
			
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,0,4,3,0,5,0};
		int[] r=movetoend(arr);
		for(int theint: r) {
			System.out.print(theint+", ");
		}
		System.out.println("");
		
		int[] arr2= {10,20,30};
		int[] r2=movetoend(arr2);
		for(int theint: r2) {
			System.out.print(theint+", ");
		}
		
		System.out.println("");
		
		int[] arr3= {0,0,0};
		int[] r3=movetoend(arr3);
		for(int theint: r3) {
			System.out.print(theint+", ");
		}
	
}//main
}