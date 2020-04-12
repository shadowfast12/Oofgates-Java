package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import attributes.weapon;
import main.Main;


public class Set_buttons {
	private int aa;
	
	Lister lr = new Lister();
	weapon w = new weapon();
	Attack at = new Attack();
	
	public void actions() {
		class ron implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(Main.stage==1) {
					at.Attacks();	
				}
				if(Main.stage==0) {
					w.weaponr(15,5,-1,15,"Rock");
					Main.stage=1;
				}

				
				aa=0;
			}
		}
		ron rn = new ron();

		class ron1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Main.option_button.removeActionListener(rn);
					if(Main.stage==0) {
						w.weaponr(25,12,-5,25,"Rusty Sword");
						Main.stage=1;
					}
					aa=0;
				}
			}
		ron1 rn1 = new ron1();
		class ron2 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
			if(Main.stage==0) {
				w.weaponr(30,8,0,30,"Dagger");
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
				lr.listers("A Black Man approaches with his sword drawn & forces you to either give him all your money or die!");
				Main.option_button.setText("Attack");
				Main.option_button2.setText("Give");
				Main.option_button3.setVisible(false);
				
			
			}
			aa++;
		}
		
	}
}
