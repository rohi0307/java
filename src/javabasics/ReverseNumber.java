package javabasics;

public class ReverseNumber {
public static void main(String[] args) {
	int reverse=0,number=123;
	while(number!=0)
	{
		int reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
	}
	System.out.println(reverse);
}
}