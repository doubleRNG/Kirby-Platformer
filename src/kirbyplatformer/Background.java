package kirbyplatformer;

import java.awt.Graphics;

public class Background extends Tile{

	public Background(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(World.background, 0, 0, 5200, 700, null);
	}

	@Override
	public void update() {
		
	}
}
