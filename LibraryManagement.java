package Prelim;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	
	// USE THIS FOR REFERENCE, GUYS! Medyo magiging problema na lang talaga natin
	// dito ay iyong implementation niya into GUI. Pero so far, ganito siya paganahin.
	
	// Note and Lapses natin:
	// Wala pa dito iyong insert, since hindi ko naman siya nakita na need sa activity ni Ma'am
	// pero kung kailangan, dagdag na lang natin!
	 // Dynamic Resizing- Enhance your array-based ADT to handle dynamic resizing - Ito rin, aayusin ko pa.
	
	// So far, dynamic naman ito, and can keep up with the array size, meaning kapag nabawasan o nadagdagan
	// ay nag-uupdate siya sa system.
	
	
	public static void main(String []args) {
		ArrayList<String> bname = new ArrayList<String>(4);
		bname.add("The Adventures of Tom Sawyer");
		bname.add("Indiana Jones");
		bname.add("Warhammer 400");
		bname.add("The Tales of Albert");
		
		System.out.println(bname);
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the Name of the Book you want to add: ");
		String newBook = scan.next();
		bname.add(0, newBook);
		System.out.println(bname);
		
		
		System.out.println("Choose the Book that you want to Remove: (Use Numbers) \n 0." + newBook + " \n 1. The Adventures of Tom Sawyer \n 3.Indiana Jones \n 4.Warhammer 400\n 5.The Tales of Albert \n 6. None");
		String bremove = scan.next();
	
		if (bremove.equals("1")) {
			bname.remove(0);
			System.out.println("Here is the Updated Book List - " + bname);
		    } 
		else if (bremove.equals("2")) {
		    	bname.remove(1);
		     System.out.println("Here is the Updated Book List - " + bname);
		    }  
		else if (bremove.equals("3")) {
	    	bname.remove(2);
	     System.out.println("Here is the Updated Book List - " + bname);
	    }  
		else if (bremove.equals("4")) {
	    	bname.remove(3);
	     System.out.println("Here is the Updated Book List - " + bname);
	    }  
		else if (bremove.equals("5")) {
	    	bname.remove(4);
	     System.out.println("Here is the Updated Book List - " + bname);
	    }  
		else if (bremove.equals("6")) {
	     System.out.println("Here is the Updated Book List - " + bname);
	    }  
		    else {
		    	System.out.println("Try Again");
		    }
		
		System.out.println("Search for a book by its index/number ");
		String choice = scan.next();
		
		
		if (choice.equals("1")) {
			choice = bname.get(0);
			System.out.println("Here is the book in that index " + choice);
		    } 
		
		else if (choice.equals("2")) {
			choice = bname.get(1);
			System.out.println("Here is the book in that index " + choice);
		    } 
		
		else if (choice.equals("3")) {
			choice = bname.get(2);
			System.out.println("Here is the book in that index " + choice);
		    } 
		
		else if (choice.equals("4")) {
			choice = bname.get(3);
			System.out.println("Here is the book in that index " + choice);
		    } 
		
		else if (choice.equals("5")) {
			choice = bname.get(4);
			System.out.println("Here is the book in that index " + choice);
		    } 
		
		 
		System.out.println("\nTotal Number of Books: "
                + bname.size());
		
		
	}
	

}
