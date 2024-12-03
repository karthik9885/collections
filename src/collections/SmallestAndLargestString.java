package collections;

import java.util.Scanner;

public class SmallestAndLargestString {

	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        int n=s.length()-k+1;
	        String[] res=new String[n];
	        
	        for(int i=0;i<n;i++)
	            res[i]=s.substring(i,i+k);
	        
	        for(int i =0; i<=res.length - 1;i++) {
	        	for(int j=0;j<res.length - i -1;j++) {
	        		
	        		if (res[j].compareTo(res[j + 1]) > 0) {
	                    String temp = res[j];
	                    res[j] = res[j + 1];
	                    res[j + 1] = temp;
	                }
	        	}
	        } 
	        
	        smallest=res[0];
	        largest=res[res.length - 1];
//	        System.out.println(largest.substring(0, k));
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }
	 
	public static void main(String[] args) {
		

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}
