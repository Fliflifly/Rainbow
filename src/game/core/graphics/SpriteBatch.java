package game.core.graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import game.core.Vector2;

public class SpriteBatch {
	
	private Graphics2D graphics;
	
	public SpriteBatch() {
		super();
	}
	
	public void rectangle(Vector2 position, Vector2 size, Color color) {
		graphics.setColor(color);
		graphics.fill(new Rectangle2D.Double(position.getX(), position.getY(), size.getX(), size.getY()));
	}
	
	public void draw(Image image, Vector2 position) {
		AffineTransform affineTransform = new AffineTransform();
		affineTransform.translate(position.getX(), position.getY());
		graphics.drawImage(image, affineTransform, null);
	}
	
	public void draw(Image image, Vector2 position, double rotation) {
		AffineTransform affineTransform = new AffineTransform();
		affineTransform.translate(position.getX(), position.getY());
		affineTransform.rotate(rotation, image.getWidth(null)/2, image.getHeight(null)/2);
		graphics.drawImage(image, affineTransform, null);
	}
	
	public void setGraphics(Graphics2D graphics) {
		this.graphics = graphics;
	}
	
}
