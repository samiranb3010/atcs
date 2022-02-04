package com.atcs.arrays;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
// details
		
		System.out.println("ENTER THE NAME : ");
		String name= sc.nextLine();
		
		System.out.println("ENTER THE MOBILE NUMBER : ");
		long mob = sc.nextLong();
		sc.nextLine();
		
		
//products
		
	String products[]= {"PEN-----10","PENCIL-----5","COPY-----20","BOOK-----50"};
	
		System.out.println("PRODUCTS AVAILABLE ALONG WITH THEIR PRICE :");
		System.out.println();
		for(int i=0;i<products.length;i++) {
			
			System.out.println(products[i]);
			
			
			System.out.println();
		}
		
//cart
		System.out.println("YOU CAN ADD MAXIMUM 5 ITEMS AT A TIME BEFORE CHECKING OUT : ");
		float sum=0;
		
		String cart[]= new String[5];
		
		for(int k=0;k<cart.length;k++) {
		
			
			System.out.println("ENTER THE ITEM U WANT TO ADD IN CART :");
			cart[k]= sc.nextLine();
			
		
		
				
			if(cart[k].equalsIgnoreCase("pen")) {
				sum=sum+10;
				
			}
			else if(cart[k].equalsIgnoreCase("pencil")) {
				sum=sum+5;
				
			}
			else if(cart[k].equalsIgnoreCase("copy")) {
				sum=sum+20;
				
			} 
			else if(cart[k].equalsIgnoreCase("book")) {
				sum=sum+50;
				
			}
			
			
		}
			
		
//coupon
		
		System.out.println("YOUR CURRENT BILL IS : "+ sum );
		System.out.println("DO YOU WANT TO APPLY COUPON TO GET 10% DISCOUNT ON BILL (Y/N) : ");
		String ans= sc.nextLine();
		
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("ENTER COUPON : ");
			String cop=sc.nextLine();
			if(cop.equalsIgnoreCase("save")) {
				sum=sum-(sum/10);
				System.out.println("YOUR CURRENT BILL AFTER DISCOUNT IS : "+ sum);
			}
			else {
				System.out.println("ENTER VALID CODE ");
			}
		
		}
		else {
			System.out.println("YOUR CURRENT BILL IS : " + sum);
		}
		
		System.out.println("=====================CUSTOMER BILL=========================");
		
// FINAL BILL
		
		System.out.println("NAME OF CUSTOMER : " + name);
		System.out.println("CUSTOMER MOBILE NUMBER : " + mob);
		System.out.println("CUSTOMER ITEMS : ");
		for(int l=0;l<cart.length;l++) {
			System.out.println(cart[l]);
			
		}
		System.out.println("AMOUNT TO BE PAID : " + sum);
		
		System.out.println("======THANKS FOR SHOPPING WITH US======");

	}

}
