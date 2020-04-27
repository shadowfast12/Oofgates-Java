package attributes;

import functions.Lister;
import functions.Luck;
import main.Main;
import main.shop;

public class weapon { 
	Lister lr = new Lister();
	
	
	public void weaponr(int d,int s,int w,String a,boolean f) {
		Luck l = new Luck();
		l.luckr();
			
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
	
	public void weapons(int c,int d,int w,String a) {
		if(Main.coins>=c && shop.type==a) {
			Main.coins-=c;
			Main.damage = d;
			Main.weapon_dur = w;
			Main.inventory[0] = a;
			
		}
	}
}
