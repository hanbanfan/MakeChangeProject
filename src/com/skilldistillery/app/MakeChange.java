package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// The user is prompted asking for the price of the item.
		System.out.print("Enter price of an item : $");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		// The user is then prompted asking how much money was tendered by the customer.
		System.out.print("Whats the cash tendered? by the customer $");
		double tendered = input.nextDouble();
		input.close();
		int penny =1, nickel=5 , dime=10, quarter=25, dollar=100, fivedollar=500 , tendollar=1000, twentydollar=2000;
		int change = (int) ((tendered * 100) - (price * 100));
		double change1 = ((double) change) / 100;
		
		// Display an appropriate message if the customer
		// provided too little money or the exact amount.
		if (tendered < price) {
			System.out.print("Sorry you didnt give enough");
		}
		if (tendered == price) {
			System.out.print("Thanks for exact change. ");
		} else if (tendered > price) {
			System.out.print("Wait for change of $" + change1);
		}
		int twentyer = change%twentydollar;
		int twenty = (twentyer)/2000;
				if (twentydollar == (change - twentyer)) {
					System.out.println("You get"+ twenty+ "$20 bill ");
				}
		int tenner = change % tendollar;
		int ten = (twentyer-tenner)/1000;
		if (tendollar == (change - tenner)) {
			System.out.println("You get"+ten+ "$10 bill ");
		}

		int fiver = tenner % fivedollar;
		int f = (tenner-fiver)/500  ;

		if (tenner >= fivedollar && tenner != tendollar) {
			System.out.println("You get" +f+ "$5 bill ");
		}

		int buck = change % dollar;

		if (fiver >= dollar) {

			int c = (fiver - buck) / 100;
			System.out.println("You get " + c + " $1 bill(s) ");
		}

		int quarters = buck % quarter;

		if (buck >= quarter) {

			int q = buck - quarters;
			q = q / quarter;
			System.out.println("You get " + q + " quarter(s) ");
		}

		int dimes = quarters % dime;

		if (quarters >= dime) {

			int d = quarters - dimes;
			d = d / dime;
			System.out.println("You get " + d + " dime(s) ");
		}
		
		int nickels = dimes % nickel;

		if (dimes >= nickel) {

			int n = dimes - nickels;
			n = n / nickel;
			System.out.println("You get " + n + " nickel(s) ");
		}
		
		
		int pennys = nickels % penny;

		if (nickels >= pennys) {

			int p = nickels - pennys;
			p = p / penny;
			System.out.println("You get " + p + " penny/ies");
		}
		

	}
}