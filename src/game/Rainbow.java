package game;

import java.awt.Color;
import java.awt.Dimension;

import game.core.Game;
import game.core.Vector2;

public class Rainbow extends Game {

	private static final long serialVersionUID = 1L;
	private Player player;

	public Rainbow() {
		super();
		player = new Player(spriteBatch, new Vector2(320, 0));
	}

	@Override
	protected void init() {
		setPreferredSize(new Dimension(640, 360));
		window.setTitle("Rainbow !");
		window.pack();
		window.setLocationRelativeTo(null);
		player.init();
	}

	@Override
	protected void load() {
		player.load();
	}

	@Override
	protected void update() {
		player.update();
	}

	@Override
	protected void draw(double interpolation) {
		spriteBatch.rectangle(new Vector2(), new Vector2(getWidth(), getHeight()), new Color(29, 30, 44));
		player.draw(interpolation);
	}

	public static void main(String[] args) {
		new Rainbow().start();
	}

}
