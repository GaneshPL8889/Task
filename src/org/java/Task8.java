package org.java;

public class Task8 {

	public static void main(String[] args) {
		int num=123, rev=0;
	    while (num!=0) {
			int remainder= num%10;
			rev = rev*10+remainder;
			num=num/10;
		}
           System.out.println("The rev number is:"+ rev);
	}

}
