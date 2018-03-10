package sensenInfosys.com.test;

import senseInfosys.com.main.BalanceOrNotAssigment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class BalanceOrNotAssigmentTest {

	
	private BalanceOrNotAssigment balanceONot;
	
	@Before public void init() {
		balanceONot  = new BalanceOrNotAssigment();
	}
	
	@Test
	public void testWithASimpleCase () {
		int[] resultBalance =  balanceONot.balanceOrNotChecking(buildStringArrayForTest(), buildMaxReplaceMentForTest());
		
		Assert.assertEquals(resultBalance[0], 1);
		Assert.assertEquals(resultBalance[1], 1);
		
	}
	
	@Test
	public void testOverMaxReplacementCase() {
		
		String[] strAr = {">>"};
		int [] maxRep = {1};
		
		int[] resultBalance = balanceONot.balanceOrNotChecking(strAr, maxRep);
		Assert.assertEquals(0, resultBalance[0]);
	}
	
	@Test
	public void testEqualMaxReplacementCase() {
		String[] strArr = {">>"};
		int [] maxRep = {2};
		
		int[] resultBalance = balanceONot.balanceOrNotChecking(strArr, maxRep);
		Assert.assertEquals(1, resultBalance[0]);
	}
	
	@Test
	public void failFromTheStart() {
		String [] strArr = {"> <> <"};
		int[] maxRep = {5};
		int[] resultBalance = balanceONot.balanceOrNotChecking(strArr, maxRep);
		Assert.assertEquals(0, resultBalance[0]);
	}
	
	private String[] buildStringArrayForTest () {
		String [] strArr = {"<<<>><<<><>>>>","<< <> >>>>>"};
		return strArr;
	}
	
	private int[] buildMaxReplaceMentForTest() {
		int[] arrInt =  {10,5};
		return arrInt;
	}

}
