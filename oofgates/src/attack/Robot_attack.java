package attack;

import functions.Lister;
import functions.Luck;
import main.Main;

public class Robot_attack {
	
	Luck lk = new Luck();
	Lister lr = new Lister();
	
	public void r_attack() {
		lk.luckr();
		int b = 0;
		if(Main.luck>=4) {
			b++;
			if(Block.blok==2) {
				Main.health-=(Main.b_damage-(Main.armor+Block.extra_block));
				lr.listers(Main.b_name+" has Dealt "+(Main.b_damage-(Main.armor+Block.extra_block))+" Damage", true);
				Block.blok=3;
			}
			else {
				Main.health-=Main.b_damage;
				lr.listers(Main.b_name+" has Dealt "+(Main.b_damage)+" Damage", true);
			}
			}
		if(Main.luck<=3 && b==0) {
			lk.luckr(1,3);
			Main.b_damage += Main.luck;
			lr.listers(Main.b_name+" drank a strength potion & increased its health to "+Main.b_damage, true);
			Block.blok=3;
		}
	}
}
