package attack;

import functions.Lister;
import functions.Luck;
import main.Main;

public class Charge {
	
	Luck lk = new Luck();
	Lister ls = new Lister();
	
	public void charge() {
		Attack.eneme=2;
		
		lk.luckr();
		if(Main.luck<=2) {
			ls.listers("You've Missed",true);
		}
		else {
			Main.b_health-=Main.damage;
			ls.listers("You've Dealt "+Main.damage+" Damage",true);
		}
	}
}
