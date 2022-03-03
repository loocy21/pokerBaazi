package Pokerbazi;

import java.util.Scanner;

public class Scanario {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Display 5000 Emoney present in the wallet:");
		int no1 = sc.nextInt();
		System.out.println("Add 3500 more emoney to the wallet");
		int no2 = sc.nextInt();
		System.out.println("Select Symbol(+,-)");
		String sym = sc.next();
		System.out.println("added the both 5000 and 3500");
		System.out.println("prchase of 6000 item using emoney");
		int no3 = sc.nextInt();
		int add = 0;
		
		
		switch(sym)
		{
		case "+":add = no1+no2;
		System.out.println("Added both emoney 5000 and 3500:"+add );
		case "-":add = add-no3;
		System.out.println("point the remaining amount in wallet:"+add);
		}
		
			
		}
		
		
		

	}

