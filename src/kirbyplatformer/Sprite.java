package kirbyplatformer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	BufferedImage background;
	File backgroundFile = new File("images/LevelBackground.GIF");
	
	BufferedImage platform;
	File platformFile = new File("images/Platform.GIF");
	
	//kirby sprite sheet
	KirbySpriteSheet kirbySheet;
	BufferedImage[] ks;		
	public BufferedImage[] kirbyImage;
	
	//waddleDee
	DeeSpriteSheet waddleDeeSheet;
	BufferedImage[] wd;		
	public BufferedImage[] waddleDeeImage;
	
	public Sprite(int choice) {
		if(choice == 1) {
			try {
				background = ImageIO.read(backgroundFile);
			}
			catch(IOException e){
			
			}
		}
		if(choice == 2) {
			try {
				platform = ImageIO.read(platformFile);
			}
			catch(IOException e){
			
			}
		}
	}
				
	public Sprite(KirbySpriteSheet kirbySheet) {
		this.kirbySheet = kirbySheet;
		ks = new BufferedImage[17];
		kirbyImage = new BufferedImage[17];
		ks = kirbySheet.getKirbySprite();
		
		//
		for(int i=0; i< ks.length; i++)
			kirbyImage[i]= ks[i];
		//
				
	}
	
	//waddleDee
	public Sprite(DeeSpriteSheet waddleDeeSheet) {
		this.waddleDeeSheet = waddleDeeSheet;
		wd = new BufferedImage[4];
		waddleDeeImage = new BufferedImage[4];
		wd = waddleDeeSheet.getWaddleDeeSprite();
		
		//
		for(int i=0; i< wd.length; i++)
			waddleDeeImage[i]= wd[i];
		//
				
	}
	
	public BufferedImage getPlatImage() {
		return platform;
	}
	
	public BufferedImage getBackgroundImage() {
		return background;
	}
	
	public BufferedImage[] getKirbyImage() {
		return kirbyImage;
	}
	
	//waddleDee
	public BufferedImage[] getWaddleDeeImage() {
		return waddleDeeImage;
	}
	
}