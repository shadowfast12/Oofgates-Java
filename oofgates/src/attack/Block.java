package attack;

import functions.Lister;
import functions.Luck;
import main.Main;

public class Block {
	Lister ls = new Lister();
	Luck l = new Luck();
	
	public static byte blok;
	public static int extra_block;	
	
	public void block() {
		Attack.eneme=2;
		l.luckr(1, 3);
		extra_block = Main.luck;
		
		ls.listers("You've blocked "+(Main.armor+extra_block)+" damage", true);
		
		blok = 2;
	}
}
