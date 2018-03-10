package sensenInfosys.com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import senseInfosys.com.main.SumToNumberIsArrayEqualK;

public class SumNumbersArrayTest {

	private SumToNumberIsArrayEqualK sum;
	
	@Before public void initData() {
		sum = new SumToNumberIsArrayEqualK();
		System.out.println("Init data first");
	}
	
	@Test
	public void test() {
		System.out.println("run test after");
		int result = sum.manyDistinctPairsHave(buildArrayToFindNumber(), 12);
		Assert.assertEquals(3, result);
		
	}
	
	@Test
	public void testingForFuntionBellow() {
		 int[] numbers = {6,6,3,9,3,5,1,6};
		 int k = 12;
		 int result = sum.manyDistinctPairsHave(numbers, k);
		 Assert.assertEquals(2,result);
		 
	}
	
	
	private int[] buildArrayToFindNumber() {
		int[] arr = {6,6,6,5,7,7,5,6,6,5,5,7,7,9,3,9,6,5,7,3,3,9};
		return arr;
	}

}
