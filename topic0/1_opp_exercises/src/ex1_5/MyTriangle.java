package ex1_5;
import ex1_3.MyPoint;

public class MyTriangle {
	
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString() {
		return "Triangle @ (" + v1.getX() + ", " + v1.getY() + "), (" + v2.getX() + ", " + v2.getY() + "), (" + v3.getX() + ", "
				+ v3.getY() + ")";
	}

	public double getPerimeter() {
		double side1 = v1.distance(v2);
		double side2 = v2.distance(v3);
		double side3 = v3.distance(v1);
		
		double perimeter = side1 + side2 + side3;
		
		return perimeter;
	}
	
	public String printType() {
		double side1 = v1.distance(v2);
		double side2 = v2.distance(v3);
		double side3 = v3.distance(v1);
		
		String type = "Not a triangle";
		
		if(side1==side2 && side2==side3)
            type = "Equilateral";

        else if ((side1==side2 && side2!=side3 ) || (side1!=side2 && side3==side1) || (side3==side2 && side3!=side1))
            type = "Isosceles";

        else if(side1!=side2 && side2!=side3 && side3!=side1)
            type = "Scalene";
		
		return type;
	}

}
