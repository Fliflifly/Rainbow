package game.core;

import game.core.graphics.SpriteBatch;

public abstract class GameObject {
	
	protected SpriteBatch spriteBatch;
	private String tag;
	private int layer;
	protected Transform transform;
	protected Vector2 velocity;
	protected double rotationSpeed;
	private boolean active;
	
	public GameObject(SpriteBatch spriteBatch) {
		super();
		this.spriteBatch = spriteBatch;
		tag = new String("");
		layer = 0;
		transform = new Transform();
		velocity = new Vector2();
	}
	
	public GameObject(SpriteBatch spriteBatch, Vector2 position) {
		this(spriteBatch);
		transform.setPosition(position);
	}
	
	public boolean compareTag(String tag) {
		return this.tag.equals(tag);
	}
	
	protected abstract void init();
	protected abstract void load();
	protected abstract void update();
	protected abstract void draw(double interpolation);

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public Transform getTransform() {
		return transform;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}
	
	public double getRotatioSpeed() {
		return rotationSpeed;
	}
	
	public void setRotationSpeed(double rotationSpeed) {
		this.rotationSpeed = rotationSpeed;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
