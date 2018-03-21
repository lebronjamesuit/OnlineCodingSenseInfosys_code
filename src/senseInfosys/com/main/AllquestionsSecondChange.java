package senseInfosys.com.main;

public class AllquestionsSecondChange {

	 public static void main(String[] args) {
		 int prices[] = {2,2,3,4,5,6,7};
		 System.out.println(calculateAmount(prices));
	 }
	
	 static long calculateAmount(int[] prices) {
		 int size = prices.length;
		 int [] dis =  new int[size];
		 int [] cost =  new int[size];
		
		 
		 for (int i = 0; i < size; i++) {
			if(i == 0) {
				dis[0] = 0;
				cost[0] = prices[0];
				//System.out.println("cost  " + cost[0]);
			} else if (i == 1) {
				dis[i] = prices[0];
				if(dis[i] > prices[i] ) {
					cost[i] = 0;
				}else {
					cost[i] = prices[i] - dis[i];
					
				}
				//System.out.println("cost  " + cost[i]);
			}
			else {
			
				int minNumbers = getMinValue(prices);
				dis[i] = minNumbers;
				if(dis[i] > prices[i] ) {
					cost[i] = 0;
				}else {
					cost[i] = prices[i] - minNumbers;
					
				}
				//System.out.println("cost  " + cost[i]);
			}
		}
		int sum  = 0 ;
		 for (int c : cost) {
			sum = sum + c;
		}
		 return Long.valueOf(sum);
	 }
	 
	 public static int getMinValue(int[] array) {
		    int minValue = array[0];
		    for (int i = 1; i < array.length -1; i++) {
		        if (array[i] < minValue) {
		            minValue = array[i];
		        }
		    }
		    return minValue;
	}
	 
	 
	
	/* static int[] getOneBits(int n) {

	  }*/
}
