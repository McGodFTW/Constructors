package Ex1;

import java.util.Scanner;

public class TestHousehold {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Household h[] = new Household[2];
		
		for(int i =0; i < h.length; i++) {
			
			h[i] = new Household();
			
		}
		
		System.out.println("How many occupants are in household 2?");
		h[1].setOccupants(input.nextInt());
		System.out.println("How much income is made in this household");
		h[1].setIncome(input.nextDouble());
		
		for(int i =0; i < h.length; i++) {
			
			System.out.println("Household #" + (i + 1));
			System.out.println("Occupants " + h[i].getOccupants());
			System.out.println("Income $" + h[i].getIncome());
			System.out.println();
			
		}

	}

}
