package attributes;

import functions.Luck;
import main.Main;

public class weapon { 
	
	@SuppressWarnings("static-access")
	public static void weaponr(int t,int d,int s,int w,String a) {
		if(Main.stage=="f") {
			Luck l = new Luck();
			l.luckr();
			Main.weapon_dur = t;
			Main.damage += Main.luck + d;
			Main.speed += s;
			Main.weapon_dur = w;
			Main.inventory[0] = a;
			Main.stage="s";
		}
	}
}
