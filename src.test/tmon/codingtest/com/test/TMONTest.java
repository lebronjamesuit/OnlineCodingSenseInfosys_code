package tmon.codingtest.com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tmon.codingtest.main.TMON;

public class TMONTest {

	private TMON tmon;
	
	@Before
	public void beforeTest() {
		if(tmon == null) {
			tmon =  new TMON();
		}
	}
	
	@Test
	public void testSimplestCase() {
		int []a = {3,4,5,6,7,8,3,9};
		int x = 7;
		int result[] = this.tmon.findOnePair(a, x);
		for (int i : result) {
			System.out.println(i);
		}
		
		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(4, result[1]);
	}
	
	@Test
	public void testSimplestCase2() {
		int []a = {1,4,5,0,7,8,3,9};
		int x = 6;
		int result[] = this.tmon.findOnePair(a, x);
		for (int i : result) {
			System.out.println(i);
		}
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(5, result[1]);
	}
	

}
