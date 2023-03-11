package kirbyplatformer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class KirbySpriteSheet {
	
	private BufferedImage[] kirbySheet;
	
	File[] kirby = {new File("images/KirbyStand1.PNG"), new File("images/KirbyStand2.PNG"),
					new File("images/KirbyStand3.PNG"), new File("images/KirbyStand4.PNG"),
					new File("images/KirbyWalk1.PNG"), new File("images/KirbyWalk2.PNG"),
					new File("images/KirbyWalk3.PNG"), new File("images/KirbyWalk4.PNG"),
					new File("images/KirbyWalk5.PNG"), new File("images/KirbyWalk6.PNG"),
					new File("images/KirbyWalk7.PNG"), new File("images/KirbyWalk8.PNG"),
					new File("images/KirbyJump1.PNG"), new File("images/KirbyJump5.PNG"),
					new File("images/KirbyJump6.PNG"), new File("images/KirbyJump10.PNG"),
					new File("images/KirbyWin.PNG")};
	
	public KirbySpriteSheet() {
			kirbySheet = new BufferedImage[17];
		
		try {
			for(int i = 0; i < kirby.length; i++) {
				kirbySheet[i] = ImageIO.read(kirby[i]);
			}
		}
		catch(IOException e){
		
		}	

}
	public BufferedImage[] getKirbySprite() {
		return kirbySheet;
	}
	

}

