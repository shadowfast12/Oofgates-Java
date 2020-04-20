package attributes;

import attack.Attack;
import functions.Luck;
import main.Main;

public class Enemy {
	Luck lk = new Luck();
	
	public void Enemies(String s, int f,int n,int n1, int n2,int n3) {
		lk.luckr();
		Main.b_name=s;
		Main.b_damage=f;
		Main.b_health=n+Main.luck;
		Main.b_coins=n1;
		Main.b_speed=n2;
		Main.b_exp=n3;
		
	}
}
