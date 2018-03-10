package senseInfosys.com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BalanceOrNotAssigment {

	/* what is balance string  <<>> , << >> ,  <<>> <> <<>>
	 * what is not balance ><>< , <>< , <<, >>
	 * How replacements make a string balance. Only replace for > by <> . For example: <<> >> replace by <<>> <> <>  
	 * String ends with < is cannot be balance in any cases. because there's no > on the right and there is no rule for replacing <
	 * If the a string array can be replaced and <= maxReplacement then return 1; > maxReplacement then return 0;
	 * If the a string array cannot be replaced -> return 0;
	 * */
	
	
	/*  Solution
	 *  Step 1: Two loops i, j to find pairs like < and > Replace "<" with "_" ; ">" = "_"
	 *  		Result step 1 may be like this:  ___ ___ >> _____ 
	 *  Step 2: Count ++ when find > ( can be replaced) OR count -- when find < ( cannot be replaced)
	 *  Step 4: Compare with MaxReplacements
	 *  
	 * */
	
	/*
	 *  Input example parameters 
		String[] = {">>>", "<><>>" }
		maxReplacement[] = {3,1}
		Output example : int[] = {1,1} 
	*/
	
	
	public int[] balanceOrNotChecking(String[] expression, int[] maxReplacements) {
		
		int[] resultBalance = new int[expression.length];
		
		for (int i = 0; i < maxReplacements.length; i++) {
			boolean balance =  isBalaceForOneString(expression[i], maxReplacements[i]);
			if(balance) {
				resultBalance[i] = 1;
			}else {
				resultBalance[i] = 0;
			}
		}
		
		return resultBalance;
	}
	
	private boolean isBalaceForOneString(String s, int maxReplacements) {
		
		char[] chars = s.toCharArray();
		if(chars[chars.length-1] == '<') {
			return false;
		} 
		
		List<String> myChar = new ArrayList<String>();
		for (char c : chars) {
			myChar.add(c+"");
		}
		
	 	List<String> optimizedMyChar = removeAllBalancedPairs(myChar);
	 	int count = 0;
	 	
	 	for (String aChar : optimizedMyChar) {
			if(aChar.equals(">")) { count++;}
			if(aChar.equals("<")) { count--;}
		}
	 	
	 	if(count < 0 ) return false;
	 	if(count >= 0) {
	 		if( count <= maxReplacements) {
	 			return true; 
	 		}else {
	 			return false;
	 		}
	 	}
		return false;
		
	}

	private List<String> removeAllBalancedPairs(List<String> myChar) {
		for (int i = 0; i < myChar.size(); i++) {
			for (int j = 0; j < myChar.size() -1; j++) {
				if(myChar.get(i).equals("<") && myChar.get(j).equals(">") ) {
					// we got a pairs so replace them by _
					myChar.set(i, myChar.get(i).replaceAll("<","_"));
					myChar.set(j, myChar.get(j).replaceAll(">","_"));
				}
			}
		}
		return myChar;
	}

}
