package ex1_5;
import ex1_3.MyPoint;

public class TestMyTriangle {
	public static void main(String[] args) {
		
		MyTriangle mt1 = new MyTriangle(0, 3, 3, 0, -3, 0);
		System.out.println(mt1);
		System.out.println("Perimeter: " + mt1.getPerimeter());
		System.out.println("Type: " +  mt1.printType());
		
		System.out.println();
		
		MyPoint mp1 = new MyPoint(5, 4);
		MyPoint mp2 = new MyPoint(7, 2);
		MyPoint mp3 = new MyPoint(-4, 1);
		
		MyTriangle mt2 = new MyTriangle(mp1, mp2, mp3);
		System.out.println(mt2);
		System.out.println("Perimeter: " + mt2.getPerimeter());
		System.out.println("Type: " +  mt2.printType());
		
	}

}
