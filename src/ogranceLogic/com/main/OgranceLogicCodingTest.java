package ogranceLogic.com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OgranceLogicCodingTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int x = 3 & 5;
			int y = 3 | 5;
			System.out.println(x);
			System.out.println(y);
	}
	
	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
		Map<String, Float> mapOrigItems = new HashMap<String, Float>();
		for (int i = 0; i < origItems.length; i++) {
			mapOrigItems.put(origItems[i], origPrices[i]);
		}
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			Float orgPrice = mapOrigItems.get(items[i]);
			if( orgPrice != null) {
				if(orgPrice != prices[i]){
					count += 1;
				}
			}
		}
		return count;
    }
	
	static int countPairs(int[] numbers, int k) {
		Map<Integer, Integer> x = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length -1; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[i] + k == numbers[j]) {
					x.put(numbers[i], numbers[j]);
				}
			}
		}
		return x.size();
    }
	
	public int numberOfPairs(int[] a, long k) {
		ArrayList<ArrayList<Integer>> noDuplicateNums = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < a.length -1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] + a[j] == k) {
					boolean shouldSelect = true;
					for (int l = 0; l < noDuplicateNums.size(); l++) {
						if( noDuplicateNums.get(l).get(0) == a[i] || noDuplicateNums.get(l).get(1) == a[i]) {
							shouldSelect = false;
						}
					}
					if(shouldSelect) {
						ArrayList<Integer> selected = new ArrayList<Integer>(2);
						selected.add(a[i]);
						selected.add(a[j]);
						noDuplicateNums.add(selected);
					}
				}
			}
		}
		return noDuplicateNums.size();
		
	}
	
	
	

}
