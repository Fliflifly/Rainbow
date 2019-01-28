package game.core;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import game.core.graphics.GraphicsDeviceManager;
import game.core.graphics.SpriteBatch;

public abstract class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	private boolean running;
	private BufferStrategy bufferStrategy;
	private Graphics2D graphics;
	protected GameWindow window;
	protected GraphicsDeviceManager graphicsDeviceManager;
	protected SpriteBatch spriteBatch;

	public Game() {
		super();
		window = new GameWindow(this);
		graphicsDeviceManager = new GraphicsDeviceManager(window);
		spriteBatch = new SpriteBatch();
		createBufferStrategy(3);
		bufferStrategy = getBufferStrategy();
	}

	public void start() {
		if (!running) {
			new Thread(this).start();
			running = true;
		}
	}

	public void stop() {
		if (running)
			running = false;
	}

	protected abstract void init();

	protected abstract void load();

	protected abstract void update();

	private void beginDraw() {
		graphics = (Graphics2D) bufferStrategy.getDrawGraphics();
		spriteBatch.setGraphics(graphics);
	}

	protected abstract void draw(double interpolation);

	private void endDraw() {
		graphics.dispose();
		graphics = null;
		bufferStrategy.show();
	}

	@Override
	public void run() {
		double targetElapsedTime = 1000_000_000.0 / 10.0;
		double elapsedTime = 0.0;
		GameTime time = new GameTime();
		init();
		load();
		while (running) {
			elapsedTime += time.deltaTime();
			while (elapsedTime >= targetElapsedTime) {
				update();
				elapsedTime -= targetElapsedTime;
			}
			beginDraw();
			draw(elapsedTime/targetElapsedTime);
			endDraw();
		}
	}

}
