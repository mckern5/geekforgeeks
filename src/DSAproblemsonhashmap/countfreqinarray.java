package DSAproblemsonhashmap;

import java.util.HashMap;
import java.util.Map;


//note: visualizer does not help
public class countfreqinarray {
	
	static Map<Integer,Integer> countFreq(int[] arr, int n) {
		
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(mp.containsKey(arr[i])){   //containskey method
				mp.put(arr[i], mp.get(arr[i])+1);  //put, get methods
			}
			else {
				mp.put(arr[i],1);   //put method
			}
		    
		}
		
		return mp;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,20,10,10,20,5,20};
		int n=arr.length;
		
		Map<Integer,Integer> theMap = countFreq(arr,n);
		
		for(Map.Entry<Integer,Integer> entry : theMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	

}
