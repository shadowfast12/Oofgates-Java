package attributes;

import functions.Luck;
import main.Main;

public class weapon { 
	
	public void weaponr(int t,int d,int s,int w,String a) {
			Luck l = new Luck();
			l.luckr();
			Main.weapon_dur = t;
			Main.damage += Main.luck + d;
			Main.speed += s;
			Main.weapon_dur = w;
			Main.inventory[0] = a;
		}
	}
