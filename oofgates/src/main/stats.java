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
		s.setResizable(false);
		s.setTitle("Stats");
		s.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		verticalBox.setBounds(10, 11, 130, 220);
		s.getContentPane().add(verticalBox);
		
		JLabel lblNewLabel_1 = new JLabel("STATS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Health: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Damage: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Armor: ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Speed: ");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Coins: ");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3);
		
		JLabel seperaterr = new JLabel("___________________");
		verticalBox.add(seperaterr);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Inventory");
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox.add(lblNewLabel_1_2_3_1);
		
		JLabel lblNewLabel_1_2_3_2 = new JLabel("item1");
		lblNewLabel_1_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3_2);
		
		JLabel lblNewLabel_1_2_3_2_1 = new JLabel("item2");
		lblNewLabel_1_2_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3_2_1);
		
		JLabel lblNewLabel_1_2_3_2_2 = new JLabel("item3");
		lblNewLabel_1_2_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3_2_2);
		
		JLabel lblNewLabel_1_2_3_2_3 = new JLabel("item4");
		lblNewLabel_1_2_3_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3_2_3);
		
		JLabel lblNewLabel_1_2_3_2_4 = new JLabel("item5");
		lblNewLabel_1_2_3_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(lblNewLabel_1_2_3_2_4);
	}
}
