package zalora.com.main;
import java.util.Scanner;

public class ZaloraMain {

	
	// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    // Input N number of lines, Ex: N =3 . we will have 3 lines.
	// Input String 1, String 2, String 3
    // abcdefghijklmnopqrstuvwxyz

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  final String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","z"};
		  System.out.println("enter N: "); 
		  Scanner s = new Scanner(System.in);
	      Integer size = Integer.valueOf(s.nextLine());                 // Reading input from STDIN
	  
	      String lines [] =  new String[size];
	      for (int i = 0; i < lines.length ; i++) {
		    	   System.out.println("enter line : " + (i+1)); 
		    	   lines[i] = s.nextLine();
	   	  }
	   
	   
	     for (String name : lines) {
	    	 	boolean complete = true;
	    	 	for (String st : str) {
	 			if( name.indexOf(st) <0 ) {
	 				complete = false;
	 			}
	 		 }
	    	 	System.out.println(complete);
		 }
	     s.close();
	}

}
