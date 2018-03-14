package tmon.codingtest.main;

import java.util.HashMap;
import java.util.Map;

public class TMON {

	/*given an array of integer number a[] and integer number X, find one pair in a[] whose sum as X.
	The complexity of the solution should be O(n)
	
	* Example let array {3,2,6,12,14,-4}. X = 16;  Output will be (2,14)
	* 
	* 
	*/
	/*Common solution
	 *  Add all the minus (x- a[0,1,2...length]) from array to a map, during this time, if any a[i..] can find in the map
	 *  it means a[i] + a[0,1,2...legth] = X
	 *  Example: map.put( x -a[1]) == put ( 16 -2 )
	 *  when the increase i to 4, a[4] = 14, check if a[i] (14) is existed in Map, yes, it is  return 14 & a[1] = 2
	 *  
	 * */
	
	public int[] findOnePair(int [] a, int x) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int result[] = new int[2];
		
		for (int i = 0; i < a.length; i++) {
			 if(map.get(a[i]) != null) {
				 result[0] = x-a[i];
				 result[1] = a[i];
				 return result;
			 }
			 int minus = x - a[i];
			 map.put(minus,minus);
		}
		return result;
	}
	
	
	
	

}
