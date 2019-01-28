package game.core;

public class GameTime {

	private long currentTime;
	private long lastTime;
	private long deltaTime;
	
	public GameTime() {
		super();
		lastTime = System.nanoTime();
	}
	
	public long deltaTime() {
		currentTime = System.nanoTime();
		deltaTime = currentTime - lastTime;
		lastTime = currentTime;
		return deltaTime;
	}
	
}
