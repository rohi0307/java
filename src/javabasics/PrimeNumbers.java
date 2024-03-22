package javabasics;

public class PrimeNumbers {
public static void main(String[] args) {
	//2,3,5,7 Divisible by 1 or itself
	int n=8;
	if(n==0 || n ==1) {
		System.out.println(n+ " not prime number");
	}
	else  {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+ " is not prime number");
				break;
			}
		}
	}
	

}
}
