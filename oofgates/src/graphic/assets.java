package graphic;

import java.awt.image.BufferedImage;

import casino.Casino;


public class assets {
	private static final int width = 512, height = 211;
	
	public static BufferedImage card;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoarder.loadImage("/oofgates/res/casino/card.jpg"));
		
		card = sheet.crop(0, 0, width, height);
		
		if(Casino.raw_num>1) {
			card = sheet.crop(width*Casino.raw_num, height*Casino.raw_num, width, height);
		}
	}

}
