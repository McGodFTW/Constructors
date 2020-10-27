package Ex3;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Circle c[] = new Circle[5];
		
		for(int x = 0; x < 2; x++) {
			
			c[x] = new Circle();
			
		}
		
		c[2] = new Circle(12, "Orange", "Blue");
		c[3] = new Circle(11, "Green", "Red");
		c[4] = new Circle(15, "Yellow", "Magenta");
		
		
		
		
		
		for(int x = 0; x < c.length; x++) {
			
			System.out.println("Circle " + (x + 1));
			System.out.println("Radius: " + c[x].getRadius());
			System.out.println("Diameter: " + c[x].returnDiameter());
			System.out.println("Border Colour: " + c[x].getBorderColour());
			System.out.println("Inner Colour: " + c[x].getInnerColour());
			System.out.println();
			
		}
		

	}

}
