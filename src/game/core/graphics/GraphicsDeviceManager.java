package game.core.graphics;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

public class GraphicsDeviceManager {

	private GraphicsDevice graphicsDevice;
	private Window window;
	
	public GraphicsDeviceManager(Window window) {
		super();
		graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		this.window = window;
	}
	
	public void toggleFullScreen() {
		if(graphicsDevice.isFullScreenSupported()) {
			graphicsDevice.setFullScreenWindow(window);
		}
	}
	
}
