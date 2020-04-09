package main;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.border.LineBorder;

import attributes.weapon;
import functions.Luck;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Main {
	//Player's Stats
	public static int health,damage,armor,level,speed,exp,luck;
	public static float weapon_dur;
	public static String[] inventory = {"a","cloth armor", "bread", "d", "e"};
	
	//Enemy Stats
	public static int b_damage,b_health,b_coins,b_speed,b_exp;
	
	public static String stage;
	
	public Main() {
		stage = "f";
		health = 100;
		damage = 10;
		armor = 2;
		speed = 10;
		weapon_dur = 0.00f;
		level = 1;

	}
	/**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings("unused")
	public void gui() {
		
		JFrame f;
		f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setTitle("OofGates");
		f.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		
		//SEPERATE CLASSES
		Luck l = new Luck();
		weapon w = new weapon();
		
		JLabel title_label = new JLabel("OofGates");
		title_label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title_label.setBounds(10, 11, 195, 32);
		f.getContentPane().add(title_label);
		
		JLabel credit_label = new JLabel("A BAUMAN CREATION");
		credit_label.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		credit_label.setBounds(48, 44, 119, 14);
		f.getContentPane().add(credit_label);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		verticalBox.setBounds(10, 80, 350, 50);
		f.getContentPane().add(verticalBox);
		
		JLabel events_label = new JLabel("You Find a Rock, a Sword, & Dagger. Pick One");
		events_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		verticalBox.add(events_label);
		
		JButton option_button = new JButton("Rock");
		option_button.setForeground(SystemColor.windowBorder);
		option_button.setBackground(SystemColor.activeCaptionBorder);
		option_button.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				w.weaponr(15,5,-1,15,"Rock");
				System.out.println(damage);
			}
		});
		option_button.setBounds(10, 141, 111, 32);
		f.getContentPane().add(option_button);
		
		JButton option_button2 = new JButton("Rusty Sword");
		option_button2.setForeground(SystemColor.windowBorder);
		option_button2.setBackground(SystemColor.activeCaptionBorder);
		option_button2.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				w.weaponr(25,12,-5,25,"Rusty Sword");
			}
		});
		option_button2.setBounds(10, 184, 111, 32);
		f.getContentPane().add(option_button2);
		
		
		JButton option_button3 = new JButton("Dagger");
		option_button3.setForeground(SystemColor.windowBorder);
		option_button3.setBackground(SystemColor.activeCaptionBorder);
		option_button3.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				w.weaponr(30,8,0,30,"Dagger");
			}
		});
		option_button3.setBounds(10, 227, 111, 32);
		f.getContentPane().add(option_button3);
		f.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	
		
		
		f.repaint();
		f.revalidate();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.gui();
	}
}

