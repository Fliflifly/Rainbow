package game.core;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameWindow extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;
	private Game game;
	
	public GameWindow(Game game) {
		super();
		this.game = game;
		add(game);
		addWindowListener(this);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent event) {

	}

	@Override
	public void windowClosing(WindowEvent event) {
		game.stop();
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent event) {

	}

	@Override
	public void windowIconified(WindowEvent event) {

	}

	@Override
	public void windowDeiconified(WindowEvent event) {

	}

	@Override
	public void windowActivated(WindowEvent event) {

	}

	@Override
	public void windowDeactivated(WindowEvent event) {

	}
}
