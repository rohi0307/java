package com.rc;
import java.util.Scanner;
public class Prog {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name=sc.nextLine();
	System.out.println("Enter your Age: ");
	int age=sc.nextInt();
	System.out.println("Enter 1 for Male / Enter 2 for female / Enter 3 for other");
    int gender=sc.nextInt();	
    if(gender == 1) {
    	if(age>=21) {
    		System.out.println(name+ "Eligible ");
    	}else {
    		System.out.println(name+ "Not eligible");
    	}
    }
    if(gender == 2) {
    	if(age>=18) {
    		System.out.println(name+" eligible");
    	}else {
    		System.out.println(name+ " Not eligible");
    	}
    	System.out.println("Bye");
    }
	}

}

