package game.core;

public class Transform {

	private Vector2 position;
	private double rotation;
	private Vector2 scale;
	
	public Transform() {
		super();
		position = new Vector2();
		scale = new Vector2();
	}
	
	public void translate(Vector2 position) {
		this.position.add(position);
	}
	
	public void rotate(double rotation) {
		this.rotation += rotation;
		checkRotation();
	}
	
	public void scale(Vector2 scale) {
		this.scale.add(scale);
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
		checkRotation();
	}

	public Vector2 getScale() {
		return scale;
	}

	public void setScale(Vector2 scale) {
		this.scale = scale;
	}
	
	private void checkRotation() {
		if(rotation > Math.toRadians(359) || rotation < Math.toRadians(-359))
			rotation = 0.0;
	}
	
}
