package main;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class stats {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void statz() {
		JFrame s;
		s = new JFrame();
		s.setBackground(Color.BLACK);
		s.getContentPane().setBackground(Color.LIGHT_GRAY);
		s.setResizable(false);
		s.setTitle("Stats");
		s.getContentPane().setLayout(null);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(200,275);
		s.setVisible(true);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		verticalBox.setBounds(10, 11, 174, 220);
		s.getContentPane().add(verticalBox);
		
		JLabel lblNewLabel_1 = new JLabel("STATS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox.add(lblNewLabel_1);
		
		JLabel health_lb = new JLabel("Health: ");
		health_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(health_lb);
		
		JLabel damage_lb = new JLabel("Damage: ");
		damage_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(damage_lb);
		
		JLabel armor_lb = new JLabel("Armor: ");
		armor_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(armor_lb);
		
		JLabel speed_lb = new JLabel("Speed: ");
		speed_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(speed_lb);
		
		JLabel coins_lb = new JLabel("Coins: ");
		coins_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(coins_lb);
		
		JLabel seperaterr = new JLabel("___________________");
		verticalBox.add(seperaterr);
		
		JLabel inventory_lb = new JLabel("Inventory");
		inventory_lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox.add(inventory_lb);
		
		JLabel first_lb = new JLabel("item1");
		first_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(first_lb);
		
		JLabel second_lb = new JLabel("item2");
		second_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(second_lb);
		
		JLabel third_lb = new JLabel("item3");
		third_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(third_lb);
		
		JLabel fourth_lb = new JLabel("item4");
		fourth_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(fourth_lb);
		
		JLabel fifth_lb = new JLabel("item5");
		fifth_lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(fifth_lb);
		
		
		class refresh extends Thread{
			public void run() {
				while(true) {
					try {
						refresh.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					health_lb.setText("Health: "+Main.health);
					damage_lb.setText("Damage: "+Main.damage);
					armor_lb.setText("Armor: "+Main.armor);
					speed_lb.setText("Speed: "+Main.speed);
					coins_lb.setText("Coins: "+Main.coins);
					first_lb.setText(Main.inventory[0]);
					second_lb.setText(Main.inventory[1]);
					third_lb.setText(Main.inventory[2]);
					fourth_lb.setText(Main.inventory[3]);
					fifth_lb.setText(Main.inventory[4]);
				}
			}
		}
			refresh r = new refresh();
			r.start();
		
	}
}
