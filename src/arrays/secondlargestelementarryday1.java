package arrays;

import java.util.Arrays;


//Day1

public class secondlargestelementarryday1 {

		//2.twopass
	    //3.one pass
	
		static int secondlarg(int[] x) {
			
			int firstlargest=-1;
			int secondlargest=-1;
			
			firstlargest=x[0];
			
			for(int i=1;i<x.length;i++) {
				
				//3 use cases
				if(x[i] > firstlargest) {
					secondlargest=firstlargest;
					firstlargest=x[i];
				}
				
				if(x[i] > secondlargest && x[i] < firstlargest) {
					secondlargest= x[i];
				}
				
				//if(x[i]<secondlargest) {
				//     secondlargest=secondlargest;
				//}
			}
			
			return secondlargest;
		}
		
		public static void main(String[] args) {
			
			int[] arr= {12,35,1,10,34,1};
			System.out.println("2ndlargest: "+secondlarg(arr));
			
			int[] arr2= {10,5,10};
			System.out.println("2ndlargest: "+secondlarg(arr2));
			
			int[] arr3= {10,10,10};
			System.out.println("2ndlargest: "+secondlarg(arr3));
		}
	
	
	
}
