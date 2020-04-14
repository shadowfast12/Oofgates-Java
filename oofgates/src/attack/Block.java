package attack;

import functions.Lister;
import main.Main;

public class Block {
	Lister ls = new Lister();
	
	public void block() {
		Attack.eneme=2;
		
		ls.listers("You've blocked "+(Main.b_damage-=Main.armor)+" damage", true);
		Main.b_damage-=Main.armor;
	}
}
