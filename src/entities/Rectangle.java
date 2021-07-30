package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2*width + 2*height;
	}
	
	public double Diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", Area())
		      + "\nPERIMETER = " + String.format("%.2f", Perimeter())
		      + "\nDIAGONAL = " + String.format("%.2f", Diagonal())
		      ;
	}
	
	
}
