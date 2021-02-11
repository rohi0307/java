public class EvenOdd {
public boolean evenOdd(int num) {
	boolean result=false;
	if(num%2 ==0) {
		result=true;
	}else {
		result=false;
	}
	return result;
}
}

//Take input from user for even odd

import java.util.Scanner;
public class InputForEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :");
	    int num=s.nextInt();
	    EvenOdd nd= new EvenOdd();
	    boolean res =nd.evenOdd(num);
	    if(res==true) {
	    	System.out.println(num+" is even");
	    }else {
	    	System.out.println(num+ " is odd");
	    }
	}

}
