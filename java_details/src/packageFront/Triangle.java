package packageFront;

public class Triangle {
	
	static int noOfSide = 3;
	double base;
	double height;
	double length;
	
	public Triangle(double base, double height, double length) {
		this.base = base;
		this.height = height;
		this.length = length;
		
	}
	
	public double findArea() {
		 double area= (this.base * this.height) /2;
		 return area;
	}

}
