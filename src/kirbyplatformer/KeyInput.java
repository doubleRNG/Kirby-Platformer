package kirbyplatformer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		for(Entity en: World.handler.entity) {
			if(en.getId() == Id.player) {
				if(e.getKeyCode() == KeyEvent.VK_D) {
					en.setVelX(5);
					en.facing = 0;
				}
				if(e.getKeyCode() == KeyEvent.VK_A) {
					en.setVelX(-5);
					en.facing = 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_W) {
					if(!en.jumping ) {
						en.jumping = true;
						en.gravity = 5.0;
					}
					en.setVelY(-5);
				}
			}
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {	
		for(Entity en: World.handler.entity) {
			if(en.getId() == Id.player) {
				if(e.getKeyCode() == KeyEvent.VK_D) {
					en.setVelX(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_A) {
					en.setVelX(0);	
				}
				if(e.getKeyCode() == KeyEvent.VK_W) {
					en.setVelY(0);
				}
			}
		}
	}

}
