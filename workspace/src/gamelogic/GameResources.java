package gamelogic;

import java.awt.image.BufferedImage;

import gameengine.loaders.ImageLoader;
import gameengine.loaders.Tileset;
import gameengine.loaders.TilesetLoader;

public final class GameResources {

	public static Tileset tileset;
	
	public static BufferedImage enemy;
	public static BufferedImage viginette;
	public static BufferedImage dropper;
	
	public static void load() {
		try {
			tileset = TilesetLoader.loadTileset("/workspaces/platformer/workspace/gfx/tileset.txt", ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/tileset.png"));
			viginette = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/viginette.png");
			enemy = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/Enemy.png");
			dropper = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/dropper.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
