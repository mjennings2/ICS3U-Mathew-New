package com.bayviewglen.blackjack;

import java.util.Scanner;

public class BumpWork {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Question One");
		CubeRoots();
		System.out.println("Question Two");
		SumSequance(keyboard);
		System.out.println("Question Three");
		Factorial(keyboard);
		System.out.println("Question Four");
		Fibonacci(keyboard);
		System.out.println("\nQuestion Five");
		Triangle(keyboard);
		System.out.println("Question Six");
		Diamond(keyboard);
		System.out.println("Question 13");
		CountDown(keyboard);
		System.out.println("Question 14");
		Point(keyboard);
		System.out.println("Question 16");
		CalenderMonth(keyboard);
		System.out.println("Question 17");
		Factors(keyboard);
	}

	private static void Triangle(Scanner keyboard) {
		System.out.println("What int?");
		int n = keyboard.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("hi");
	}

	private static void Factors(Scanner keyboard) {
		System.out.println("Enter a Number:");
		int x = keyboard.nextInt();
		for(int i = 1; i <= x; i++){
			if(x % i == 0){
				System.out.print(i + "\t");
			}
		}
		
	}

	private static void CalenderMonth(Scanner keyboard) {
		System.out.println("Day the month starts on (1 for Sunday):");
		int n = keyboard.nextInt();
		System.out.println("Number of days in this month?");
		int x = keyboard.nextInt();
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		for(int i = 1; i < n; i++){
			System.out.print("    ");
		}
		int t = 1;
		for(int i = 0; i <= 7 - n; i++){
			System.out.print("   " + t);
			t++;
		}
		System.out.print("\n");
		for(int i = 7-n+1; i <= x; i++){
			for(int j = 1; j <= 7; j++)
				if(t <= 9){
					System.out.print("   " + t);
					t++;
				}else if(!(t>=x+1)){
					System.out.print("  " + t);
					t++;
				}else{
					
				}
			System.out.print("\n");
		}
		
	}

	private static void Point(Scanner keyboard) {
		int n = (int)(Math.random()*6+1);
		System.out.println("The number is " + n);
		int trials = 0;
		boolean isEqual = false;
		while(!isEqual){
			int x = (int)(Math.random()*6+1);
			if(x == n){
				isEqual = true;
			}
			System.out.println(x);
			trials++;
		}
		System.out.println("It took " + trials + " times.");
		
	}

	private static void CountDown(Scanner keyboard) {
		System.out.print("What number do I stop at?");
		int n = keyboard.nextInt();
		System.out.println("100");
		int i = 95;
		while(i > n){
			System.out.println(" " + i);
			i -= 5;
		}
		System.out.println("I stopped.");
		
	}

	private static void Diamond(Scanner keyboard) {
		for(int i = 1; i<=5; i++){
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			for(int j = 5; j > 5-i; j--){
			System.out.print("*");
			}
			for(int j = 4; j > 5-i; j--){
				System.out.print("*");
			}
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			System.out.print("\n");
			}
		for(int i = 4; i<=4 && i != 0; i--){
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			for(int j = 4; j > 5-i; j--){
				System.out.print("*");
			}
			for(int j = 5; j > 5-i; j--){
				System.out.print("*");
				}
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			System.out.print("\n");
			}
		
	}

	private static void Fibonacci(Scanner keyboard) {
		System.out.println("What int?");
		int n = keyboard.nextInt();
		int one = 0;
		int two = 0;
		int x = 1;
		for(int i= 1; i <= n; i++){
			System.out.print(x + "\t");
			one = two;
			two = x;
			x = one + two;
			
			
		}
	}

	private static void Factorial(Scanner keyboard) {
		System.out.println("What int?");
		int x = keyboard.nextInt();
		int product = 1;
		for(int i = 1; i<=x; i++){
			product*=i;
		}
		System.out.println(product);
	}

	private static void SumSequance(Scanner keyboard) {
		System.out.println("What int?");
		int x = keyboard.nextInt();
		int sum = 0; 
		for(int i = 0; i<=x; i++){
			sum+=i;
		}
		System.out.println(sum);
		
	}

	private static void CubeRoots() {
		
		for(int i = 10; i <= 50; i++){
			System.out.printf("%15d", i);
			System.out.printf("%15f", (Math.pow(i, 1.0/3.0)));
			System.out.print("\n");
			
		}
		
	}

}
