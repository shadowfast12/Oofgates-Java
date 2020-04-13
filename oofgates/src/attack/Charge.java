package attack;

import functions.Lister;
import functions.Luck;
import main.Main;

public class Charge {
	
	Luck lk = new Luck();
	Lister ls = new Lister();
	
	public void charge() {
		lk.luckr();
		if(Main.luck<=2) {
			ls.listers("YOU HAVE MISSED",true);
		}
		else {
			Main.b_health-=Main.damage;
			ls.listers("YOU HAVE DEALT "+Main.damage,true);
		}
	}
}
