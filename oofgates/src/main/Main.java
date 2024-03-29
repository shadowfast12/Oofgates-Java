package main;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.border.LineBorder;

import attributes.weapon;
import functions.Lister;
import functions.Load_save;
import functions.Luck;
import functions.Save;
import functions.Set_buttons;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

//**use arrays for the cards in the blackjack**
public class Main {
	//Player's Stats
	public static int health,damage,armor,level,speed,exp,luck,singl,coins;
	public static float weapon_dur;
	public static String[] inventory = {"a","Cloth Armor", "Bread", "Nothing", "Nothing"},events;
	
	public static JButton option_button1,option_button2,option_button3,option_button4;
	public static JList<String> list,list_1;
	
	public static List<String>all_events = new ArrayList<String>();
	
	//Enemy Stats
	public static int b_damage,b_health,b_coins,b_speed,b_exp,stage,index;
	public static String b_name;
	public static JFrame f;
	public static JTextArea event_label;
	
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	
	
	public Main() {
		singl = 0;
		stage = 0;
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
	@SuppressWarnings({ "unused" })
	public void gui() {
		f = new JFrame();
		f.setResizable(false);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setTitle("OofGates");
		f.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450,520);
		f.setVisible(true);
		
		
		//SEPERATE CLASSES
		Luck l = new Luck();
		Set_buttons sb = new Set_buttons();
		Liste lste = new Liste();
		Lister lr = new Lister();
		Save s = new Save();
		stats st = new stats();
		Settings stg = new Settings();
		
				
		JLabel title_label = new JLabel("OofGates");
		title_label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title_label.setBounds(10, 11, 195, 32);
		f.getContentPane().add(title_label);
		
		JLabel credit_label = new JLabel("A BAUMAN CREATION");
		credit_label.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		credit_label.setBounds(48, 44, 119, 14);
		f.getContentPane().add(credit_label);
		
		option_button1 = new JButton("Rock");
		option_button1.setForeground(SystemColor.windowBorder);
		option_button1.setBackground(SystemColor.activeCaptionBorder);
		option_button1.setBounds(10, 153, 150, 50);
		f.getContentPane().add(option_button1);
		
		option_button2 = new JButton("Rusty Sword");
		option_button2.setForeground(SystemColor.windowBorder);
		option_button2.setBackground(SystemColor.activeCaptionBorder);
		option_button2.setBounds(10, 216, 150, 50);
		f.getContentPane().add(option_button2);
		
		
		option_button3 = new JButton("Dagger");
		option_button3.setForeground(SystemColor.windowBorder);
		option_button3.setBackground(SystemColor.activeCaptionBorder);
		option_button3.setBounds(10, 279, 150, 50);
		f.getContentPane().add(option_button3);
		
		option_button4 = new JButton();
		option_button4.setForeground(SystemColor.windowBorder);
		option_button4.setBackground(SystemColor.activeCaptionBorder);
		option_button4.setBounds(10, 342, 150, 50);
		option_button4.setVisible(false);
		f.getContentPane().add(option_button4);
		
		btnNewButton = new JButton("Events");
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lste.list_gui();
			}
		});
		btnNewButton.setForeground(SystemColor.windowBorder);
		btnNewButton.setBounds(299, 400, 125, 50);
		f.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(705, 469, 8, 9);
		f.getContentPane().add(scrollPane);
		scrollPane.setVisible(false);
		
		list_1 = new JList<String>();
		scrollPane.setViewportView(list_1);
		
		event_label = new JTextArea();
		event_label.setText("Event here");
		event_label.setRows(3);
		event_label.setLineWrap(true);
		event_label.setEditable(false);
		event_label.setBackground(Color.LIGHT_GRAY);
		event_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		event_label.setBounds(10, 69, 424, 79);
		f.getContentPane().add(event_label);
		
		JButton stats_btn = new JButton("Stats");
		stats_btn.setForeground(SystemColor.windowBorder);
		stats_btn.setBackground(SystemColor.activeCaptionBorder);
		stats_btn.setBounds(299, 342, 125, 50);
		stats_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st.statz();
			}
		});
		f.getContentPane().add(stats_btn);
		
		JButton settings_btn = new JButton("Settings");
		settings_btn.setForeground(SystemColor.windowBorder);
		settings_btn.setBackground(SystemColor.activeCaptionBorder);
		settings_btn.setBounds(299, 457, 125, 21);
		f.getContentPane().add(settings_btn);
		settings_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stg.setting();
			}
		});
		
		f.repaint();
		f.revalidate();
	
		
		
	class refresh extends Thread{
		public void run() {
			while(true) {
				try {
					refresh.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sb.set_button();
				if(Main.stage != 0) {
					s.save();
				}
			}
		}
	}
	refresh rsh = new refresh();
	rsh.start();
	
	
	lr.listers("You Find a Rock, Sword, & dagger. Pick one.");
	sb.actions();
	
	
}
	
	
	
	
	public static void main(String[] args) {
		Main m = new Main();
		m.gui();
	}
}

