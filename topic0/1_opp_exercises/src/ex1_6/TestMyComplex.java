package ex1_6;

public class TestMyComplex {
	public static void main(String[] args) {
		
		MyComplex complex = new MyComplex(5, 21);

		System.out.println("Complex: " + complex);
		System.out.println("Real part: " + complex.getReal());
		System.out.println("Imaginary part: " + complex.getImag());
		System.out.println("Is real?? " + complex.isReal());
		System.out.println("Is imaginary?? " + complex.isImaginary());
		System.out.println("Equals (0, 0i)?? " + complex.equals(0, 0));
		System.out.println("Equals (5, 21i)?? " + complex.equals(new MyComplex(5, 21)));
		System.out.println("Magnitude: " + complex.magnitude());
		System.out.println("Conjugate: " + complex.conjugate());
		System.out.println("Argument in radians: " + complex.argumentInRadians());
		System.out.println("Argument in degrees: " + complex.argumentInDegrees());
		System.out.println("Add: " + complex.add(new MyComplex(1, 1)));
		System.out.println("Subtract: " + complex.subtract(new MyComplex(1, 30)));
		System.out.println("Multiply with: " + complex.multiplyWith(new MyComplex(2, -2)));
		System.out.println("Divide by: " + complex.divideBy(new MyComplex(3, 2)));
	}
}	
