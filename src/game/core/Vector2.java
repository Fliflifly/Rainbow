package game.core;

public class Vector2 {

	private double x, y;
	
	public Vector2() {
		super();
	}
	
	public Vector2(Vector2 vector2) {
		super();
		x = vector2.getX();
		y = vector2.getY();
	}

	public Vector2(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void add(Vector2 position) {
		x += position.getX();
		y += position.getY();
	}
	
	public void scale(Vector2 scale) {
		x *= scale.getX();
		y *= scale.getY();
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
