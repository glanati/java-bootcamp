package ex1_13;

public class Container {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Container (int x, int y, int width, int height) {
		this.x1 = x;
		this.y1 = y;
		this.x2 = x1+width-1;
		this.y2 = y1+height-1;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public String toString() {
		return "Container at (" + this.x1 + ", " + this.y1 + ") to (" + this.x2 + ", " + this.y2 + ")";
	}
	
	
	// A boolean method called collidesWith(Ball), which check if the given Ball is outside the bounds of the container box. If so, it invokes the 
   // Ball's reflectHorizontal() and/or reflectVertical() to change the movement direction of the ball, and returns true.
	public boolean collidesWith(Ball ball) {
		   if (ball.getX() - ball.getRadius() <= this.x1 ||
		       ball.getX() - ball.getRadius() >= this.x2) {
		      ball.reflectHorizontal();
		      return true;
		   }
		   if (ball.getY() - ball.getRadius() <= this.y1 ||
			       ball.getY() - ball.getRadius() >= this.y2) {
			      ball.reflectHorizontal();
			      return true;
		   }
		   return false;
	}

}
