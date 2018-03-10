package senseInfosys.com.main;

import java.util.ArrayList;

public class SumToNumberIsArrayEqualK {

	// Tim ra tat ca cac cap so trong array, sao cho sum cua moi cap equals K, va khong tim ra cap trung nhau
	// Neu cap so la  5,7 hay 7,5 -> tinh la 1 cap.
	// VD: Arr = int[] arr = {6,6,6,5,7,7,5,6,6,5,5,7,7,9,3,9,6,5,7,3,3,9}; --> se co cap [6,6] [5,7] [9,3] = 3 pairs hop le
	
	/*
	Solution
	  1. Run 2 Loop i and j at the same time. Find out pairs have sum is K. 
	  2. Put those pairs to noDuplicateNums, check whether the pairs is kind of similar with existed pairs.s
	  3. Return size of noDuplicateNums.  
	*
	*/
	public int manyDistinctPairsHave(int[] numbers, int k) {
		ArrayList<ArrayList<Integer>> noDuplicateNums = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numbers.length -1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == k) {
					boolean shouldSelect = true;
					for (int l = 0; l < noDuplicateNums.size(); l++) {
						if( noDuplicateNums.get(l).get(0) == numbers[i] || noDuplicateNums.get(l).get(1) == numbers[i]) {
							shouldSelect = false;
						}
					}
					if(shouldSelect) {
						ArrayList<Integer> selected = new ArrayList<Integer>(2);
						selected.add(numbers[i]);
						selected.add(numbers[j]);
						noDuplicateNums.add(selected);
					}
				}
			}
		}
		return noDuplicateNums.size();
		
	}
}
