package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import attack.Attack;
import attributes.Enemy;
import attributes.weapon;
import main.Main;
import main.shop;


public class Set_buttons {
	private int aa;
	
	Lister lr = new Lister();
	weapon w = new weapon();
	Attack at = new Attack();
	Luck lk = new Luck();
	Enemy en = new Enemy();
	shop s = new shop();

	public void actions() {
		class ron implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//shop
				if(Main.stage==2) {
					s.shope();
				}
				//attack
				if(Main.stage==1) {
					at.Attacks();
					en.Enemies("Black Man",10,50,4,2,0);
					Main.stage=2;
					Main.f.setVisible(false);
				}
				if(Main.stage==0) {
					w.weaponr(5,-1,15,"Rock",true);
					Main.stage=1;
				}

				
				aa=0;
			}
		}
		ron rn = new ron();

		class ron1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
					if(Main.stage==1) {
						Main.coins = 0;
						lr.listers("You have lost all your coins");
						Main.stage=2;
					}
					if(Main.stage==0) {
						w.weaponr(12,-5,25,"Rusty Sword",false);
						Main.stage=1;
					}
					aa=0;
				}
			}
		ron1 rn1 = new ron1();
		class ron2 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
			if(Main.stage==0) {
				w.weaponr(8,0,30,"Dagger",false);
				Main.stage=1;
				}
			aa=0;
			}
		}
		ron2 rn2 = new ron2();

			
		Main.option_button.addActionListener(rn);
		Main.option_button2.addActionListener(rn1);
		Main.option_button3.addActionListener(rn2);
	
	}
	
	public void set_button() {
		//first fight
		if(aa==0) {
			if(Main.stage == 1) {
				lr.listers("A Black Man approaches with his sword drawn & forces you to"
						+"either give him all your money or die!");
				Main.option_button.setText("Attack");
				Main.option_button2.setText("Give");
				Main.option_button3.setVisible(false);
				
			
			}
			if(Main.stage==2) {
				System.out.println("no");
				lr.listers("You can go to:");
				Main.option_button.setText("Shop");
				Main.option_button2.setText("Forest");
				Main.option_button3.setText("Casino");
				Main.option_button4.setText("Arena");
			}
			aa++;
		}
		
	}
}
