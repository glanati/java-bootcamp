package ex1_13;

public class TestBall {
	public static void main(String[] args) {
		
		Ball ball = new Ball (2, 2, 5, 1, 1);
		
		System.out.println(ball);
		System.out.print("Radius: ");
		System.out.println(ball.getRadius());
		
		System.out.println();
		
		ball.setXY(6, 7);
		System.out.println(ball);
		
		System.out.println();
		
		ball.move();
		System.out.println("Ball moves");
		System.out.println(ball);
		
		System.out.println();
		
		ball.reflectHorizontal();
		System.out.println("Ball reflects horizontal");
		System.out.println(ball);
		
		System.out.println();
		
		ball.reflectVertical();
		System.out.println("Ball reflects vertical");
		System.out.println(ball);
		
	}

}
