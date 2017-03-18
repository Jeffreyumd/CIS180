/***********************************************************
 * Lab #4 (CIS 181)                             *
 * Submitted By: Your name here !!!                        *
 * SID: Your new SID starting with "00"                    *
 * Date: Your submission date                              *
 ***********************************************************/


public class TestIntSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] s = {2, 5, 11, 19};
		
		int[] k = {2, 3, 5, 19};
		
		IntSet is = new IntSet(s);
		IntSet ik = new IntSet(k);
		
		System.out.println("------Union-----");
		is.union(ik);
		
		System.out.println("-----Intersection-----");
		is.intersection(ik);
		
		System.out.println("-----Complement-----");
		is.complement();

		// Test cases
		System.out.println("Befroe insertion: " + is.toString());
		is.insert(34);
		is.insert(100);
		System.out.println("After insertion: " + is.toString());
		
		is.remove(34);
		//is.union();

		System.out.println("\nBefroe insertion: " + is.toString());
		is.insert(-88);
		System.out.println("After insertion: " + is.toString());

	}

}