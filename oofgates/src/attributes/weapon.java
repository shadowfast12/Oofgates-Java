package attributes;

import functions.Lister;
import functions.Luck;
import main.Main;

public class weapon { 
	Lister lr = new Lister();
	
	
	public void weaponr(int t,int d,int s,int w,String a,boolean f) {
			Luck l = new Luck();
			l.luckr();
			
			Main.weapon_dur = t;
			Main.damage = d;
			Main.speed += s;
			Main.weapon_dur = w;
			Main.inventory[0] = a;
			
			if(f=true) {
				Main.damage+=Main.luck;
			}
			
			Main.all_events.add(a);
			Main.list_1.setListData(Main.all_events.toArray(new String[0]));		
			}
	}
