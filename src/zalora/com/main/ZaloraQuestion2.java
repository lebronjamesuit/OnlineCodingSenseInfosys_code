package zalora.com.main;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZaloraQuestion2 {
	// War between two tribes
  /*100100
	001010
	000000
	110000
	111000
	010100 */
	
    private static Map<String, String> map = new HashMap<String, String>();
    private static int[][] A;
    private static int row; 
    private static int col;

	public static void main(String[] args) {
		// Initialize data for two dimension array [i][j] 
	   
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println(" It is gonna be a square so enter the row number: ");
	    row = scanner.nextInt();
	    col = row;
	         
	    A = new int[row][col];
	         
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print("Enter element has index [" + i + ", " + j + "]: ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	  
	    System.out.println(" Let's see the array you have just entered: ");
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	       
	        System.out.println("\n");   
	    }
	    
	    int count = 0;
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	          if(A[i][j] == 1 && map.get(genKey(i, j)) == null) {
	        	  	buildWarrior(i,j);
	        		count = count + 1;
	          }  
	        }
	          
	    }
	    
	    System.out.println(count);
	}
	
	
	public static void buildWarrior(int i, int j ) {
		
		int mi = i-1;
		int pi = i+1;
		int mj = j-1;
		int pj = j+1;
		
		if( mi >=0 && mj >=0 && A[mi][mj] == 1) {
			if(map.get(genKey(mi, mj)) == null ) {
				map.put(genKey(mi, mj),genKey(mi, mj) );
				System.out.println("i :"+mi + " j:"+mj );
				 buildWarrior((mi), (mj));
			}
		}
		if( mi >=0 && j >=0 && A[mi][j] == 1) {
			if(map.get(genKey(mi, j)) == null ) {
				map.put(genKey(mi, j),genKey(mi, j) );
				System.out.println("i :"+mi + " j:"+j );
				 buildWarrior((mi), (j));
			}
		} 
		
		if( mi >=0 && pj < row && A[mi][pj] == 1) {
			if(map.get(genKey(mi, pj)) == null ) {
				map.put(genKey(mi, pj),genKey(mi, pj) );
				System.out.println("i :"+mi + " j:"+pj );
				 buildWarrior((mi), (pj));
			}
		} 
		
		if( i >=0 && mj >=0 && A[i][mj] == 1) {
			if(map.get(genKey(i, mj)) == null ) {
				map.put(genKey(i, mj),genKey(i, mj) );
				System.out.println("i :"+i + " j:"+mj );
				 buildWarrior((i), (mj));
			}
		}
		
		if( i >=0 && pj < row && A[i][pj] == 1) {
			if(map.get(genKey(i, pj)) == null ) {
				map.put(genKey(i, pj),genKey(i, pj) );
				System.out.println("i :"+i + " j:"+pj );
				 buildWarrior((i), (pj));
			}
		}
		
		if( pi < row && mj >=0 && A[pi][mj] == 1) {
			if(map.get(genKey(pi, mj)) == null ) {
				map.put(genKey(pi, mj),genKey(pi, mj) );
				System.out.println("i :"+pi + " j:"+mj );
				 buildWarrior((pi), (mj));
			}
		}
		
		if( pi < row && j >=0 && A[pi][j] == 1) {
			if(map.get(genKey(pi, j)) == null ) {
				map.put(genKey(pi, j),genKey(pi, j) );
				System.out.println("i :"+pi + " j:"+j );
				 buildWarrior((pi), (j));
			}
		}
		
		if( pi < row && pj < row && A[pi][pj] == 1) {
			if(map.get(genKey(pi, pj)) == null ) {
				map.put(genKey(pi, pj),genKey(pi, pj) );
				System.out.println("i :"+pi + " j:"+pj );
				 buildWarrior((pi), (pj));
			}
		}
	}
	
	public static String genKey(int i , int j){
		return "A["+i+"]"+"["+j+"]";
	}

}
