package Ex2;

public class Box {
	
	int length, width, height;
	
	public Box(int l) {
		
		width = 0;
		height = 0;
		
	}
	
	public Box(int l, int w) {
		
		height = 0;
		
	}
	
	public Box(int l, int w, int h) {
		
		
		
	}
	
	public void setLength(int l) {
		
		length = l;
		
	}
	
	public void setWidth(int w) {
		
		width = w;
		
	}
	
	public void setHeight(int h) {
		
		height = h;
		
	}
	
	public int getLength() {
		
		return length;
		
	}
	
	public int getWidth() {
		
		return width;
		
	}
	
	public int getHeight() {
		
		return height;
		
	}
}
