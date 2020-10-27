package Ex2;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		
		int l = 0,w = 0,h = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to create a: \n1. Line \n2. Rectangle \n3. Box");
		
		int choice = input.nextInt();
		
		switch(choice) {
		
			case 1:
				
				System.out.println("Enter the length of the line");
				l = input.nextInt();
				Box line = new Box(l);
				System.out.println("Line created with a length of " + line.getLength());
				break;
			
			case 2:
				System.out.println("Enter the length of the line");
				l = input.nextInt();
				System.out.println("Enter the width of the square");
				w = input.nextInt();
				Box square = new Box(l,w);
				System.out.println("Rectangle created with a length of " + square.getLength() + " and a width of " + square.getWidth());
				break;
			
			case 3:
				
				System.out.println("Enter the length of the line");
				l = input.nextInt();
				System.out.println("Enter the width of the square");
				w = input.nextInt();
				System.out.println("Enter the height of the cube");
				h = input.nextInt();
				Box cube = new Box(l,w,h);
				System.out.println("Rectangle created with a length of " + cube.getLength() + ", a width of " + cube.getWidth() + " and a height of " + cube.getHeight());
				break;
			
			default:
				System.out.println("ERROR >> Invalid input");
				break;
		
		}

	}

}
