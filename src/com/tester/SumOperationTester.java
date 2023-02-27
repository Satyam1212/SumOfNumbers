package com.tester;

import java.util.Scanner;

public class SumOperationTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the One Number");
			int a = sc.nextInt();
			System.out.println("Enter the Second Number");
			int b = sc.nextInt();
			
			int add = a + b;
			
			System.out.println("Addition of "+ a +" and "+ b+" is " + add);
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
