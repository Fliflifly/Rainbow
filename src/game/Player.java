package game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.core.GameObject;
import game.core.Vector2;
import game.core.graphics.SpriteBatch;

public class Player extends GameObject {

	private BufferedImage image;
	
	public Player(SpriteBatch spriteBatch) {
		super(spriteBatch);
		try {
			image = ImageIO.read(new File("assets/image.png"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public Player(SpriteBatch spriteBatch, Vector2 position) {
		super(spriteBatch, position);
		try {
			image = ImageIO.read(new File("assets/image.png"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	@Override
	protected void init() {
		setVelocity(new Vector2(0, 0));
		setRotationSpeed(Math.toRadians(20));
	}

	@Override
	protected void load() {

	}

	@Override
	protected void update() {
		transform.translate(velocity);
		transform.rotate(rotationSpeed);
		System.out.println(transform.getPosition());
	}

	@Override
	protected void draw(double interpolation) {
		Vector2 position = new Vector2(transform.getPosition());
		Vector2 interpolateVelocity = new Vector2(velocity);
		interpolateVelocity.scale(new Vector2(interpolation, interpolation));
		position.add(interpolateVelocity);
		spriteBatch.draw(image, position, transform.getRotation() + (rotationSpeed * interpolation));
	}
	
}
