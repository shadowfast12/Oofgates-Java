package functions;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;

public class Attack {
	
	Luck l = new Luck();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void Attacks() {
		JFrame aa = new JFrame();
		aa.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		aa.setTitle("Die Schlägerei");
		aa.setResizable(false);
		aa.getContentPane().setBackground(SystemColor.controlShadow);
		aa.getContentPane().setLayout(null);
		aa.setSize(550,375);
		aa.setVisible(true);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		verticalBox.setBounds(10, 56, 140, 176);
		aa.getContentPane().add(verticalBox);
		
		JLabel yours = new JLabel("YOUR STATS");
		yours.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox.add(yours);
		
		JLabel seperateer = new JLabel("___________________");
		verticalBox.add(seperateer);
		
		JLabel Health_label = new JLabel("Health: ");
		Health_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(Health_label);
		
		JLabel Damage_label = new JLabel("Damage: ");
		Damage_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(Damage_label);
		
		JLabel seperaterr = new JLabel("___________________");
		verticalBox.add(seperaterr);
		
		JLabel lblInventory = new JLabel("INVENTORY");
		lblInventory.setFont(new Font("Tahoma", Font.BOLD, 12));
		verticalBox.add(lblInventory);
		
		JLabel first_item = new JLabel("item here");
		first_item.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(first_item);
		
		JLabel second_item = new JLabel("item here");
		second_item.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(second_item);
		
		JLabel third_item = new JLabel("item here");
		third_item.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(third_item);
		
		JLabel fourth_item = new JLabel("item here");
		fourth_item.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(fourth_item);
		
		JLabel fifth_item = new JLabel("item here");
		fifth_item.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox.add(fifth_item);
		
		JLabel title = new JLabel("Die Schlägerei");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.TOP);
		title.setFont(new Font("Modern No. 20", Font.PLAIN, 32));
		title.setBounds(10, 11, 519, 43);
		aa.getContentPane().add(title);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		verticalBox_1.setBounds(389, 56, 140, 176);
		aa.getContentPane().add(verticalBox_1);
		
		JLabel Ene = new JLabel("ENEMY STATS");
		Ene.setFont(new Font("Tahoma", Font.BOLD, 14));
		verticalBox_1.add(Ene);
		
		JLabel label_1 = new JLabel("___________________");
		verticalBox_1.add(label_1);
		
		JLabel EHealth_label = new JLabel("Health: ");
		EHealth_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox_1.add(EHealth_label);
		
		JLabel EDamage_label = new JLabel("Damage: ");
		EDamage_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		verticalBox_1.add(EDamage_label);
		
		JLabel label_4 = new JLabel("___________________");
		verticalBox_1.add(label_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(160, 140, 218, 43);
		aa.getContentPane().add(panel);
		
		JLabel event = new JLabel("Event here");
		panel.add(event);
		
		JButton Charge_button = new JButton("CHARGE!");
		Charge_button.setForeground(SystemColor.windowBorder);
		Charge_button.setBackground(SystemColor.activeCaptionBorder);
		Charge_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Charge_button.setBounds(10, 243, 232, 63);
		aa.getContentPane().add(Charge_button);
		
		JButton Block_button = new JButton("BLOCK");
		Block_button.setForeground(SystemColor.windowBorder);
		Block_button.setBackground(SystemColor.activeCaptionBorder);
		Block_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Block_button.setBounds(297, 243, 232, 63);
		aa.getContentPane().add(Block_button);
		
		JButton btnNewButton = new JButton("USE ITEM");
		btnNewButton.setForeground(SystemColor.windowBorder);
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setBounds(227, 317, 89, 23);
		aa.getContentPane().add(btnNewButton);
	}
}
