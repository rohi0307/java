package javabasics;

public class Palimdrome {

	public static void main(String[] args) {
		int num = 515, r, sum = 0,temp;
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) 
			System.out.println(" is palimdrome");
		 else 
			System.out.println(" is not palimdrome");
	}

}
