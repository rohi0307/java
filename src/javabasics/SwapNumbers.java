package javabasics;

public class SwapNumbers {
public static void main(String[] args) {
	//using temp variable
	int a=10,b=20,temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+" "+b);
	
	//wihout third variable
	int m=11,n=12;
	m=m-n;	//difference in first variable
	n=m+n;	//Addition in second variable 
	m=n-m;	//difference but reverse
	System.out.println(m+" "+n);
	
}
}
