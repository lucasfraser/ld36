package au.com.ionprogramming.ld36.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import au.com.ionprogramming.ld36.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "LD36 - Ion Programming";
		config.width = 1000;
		config.height= 700;
		new LwjglApplication(new MainGame(), config);
	}
}
