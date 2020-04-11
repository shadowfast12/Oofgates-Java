package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Main;


public class Set_buttons {
	
	Lister lr = new Lister();
	
	
	public void Set_button() {
		Main.option_button.removeActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});

		//first fight
		if(Main.stage == 1) {
			lr.listers("A Black Man approaches with his sword drawn & forces you to either give him all your money or die!");
			Main.option_button.setText("Attack"); 
			Main.option_button2.setText("Give");
			Main.option_button3.setVisible(false);
			
			Main.option_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.stage=2;
				}
			});

			
		}
		Main.stage = -999;
	}
}
