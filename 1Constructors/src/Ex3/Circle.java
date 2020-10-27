package Ex3;

public class Circle {
	
	double radius;
	String innerColour, borderColour;
	
	public Circle() {
		
		radius = 0.0;
		borderColour = "Black";
		innerColour = "White";
		
	}
	
	public Circle(double r, String i, String b) {
		
		radius = r;
		innerColour = i;
		borderColour = b;
		
	}
	
	public void setRadius(double r) {
		
		radius = r;
		
	}
	
	public void setBorderColour(String b) {
		
		borderColour = b;
		
	}
	
	public void setInnerColour(String i) {
		
		innerColour = i;
		
	}
	
	public double getRadius() {
		
		return radius;
		
	}
	
	public String getBorderColour() {
		
		return borderColour;
		
	}
	
	public String getInnerColour() {
		
		return innerColour;
		
	}
	
	public double returnDiameter() {
		
		double d = radius * 2;
		return d;
	}

}
