package arrays;

import java.util.Arrays;
//Day 3
public class reversearray {

	static int[] rev(int[] arr) {
		
		int[] temp= new int[arr.length];
		Arrays.fill(temp, 0);    //fill method of Arrays
		
		int j=0;
		
		for(int i=arr.length-1;i>-1;i--) {
			temp[j]=arr[i];
			j++;
		}
		
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,3,2,6,5};
		int[] result=rev(arr);
		for(int x:result) {
		   System.out.print(x+", ");
		}
		System.out.println();
		
		int[] arr2= {4,5,2};
		int[] result2=rev(arr2);
		for(int x:result2) {
		   System.out.print(x+", ");
		}
		System.out.println("");
		
		int[] arr3= {1};
		int[] result3=rev(arr3);
		for(int x:result3) {
		   System.out.print(x+", ");
		}
		
		
	}
 
}
