package attack;

import functions.Lister;
import functions.Luck;
import main.Main;

public class Robot_attack {
	
	Luck lk = new Luck();
	Lister lr = new Lister();

	public void r_attack() {
		lk.luckr();
		if(Main.luck>=4) {
			lk.luckr();
			Main.health-=Main.b_damage;
			lr.listers(Main.b_name+" has Dealt "+Main.b_damage+Main.luck+" Damage", true);
		}
		if(Main.luck<=3) {
			lk.luckr();
			Main.b_damage += Main.luck;
			lr.listers(Main.b_name+" drank a strength potion & increased its health to "+Main.b_damage, true);
		}
	}
}
