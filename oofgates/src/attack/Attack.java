package attack;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;

import attributes.Enemy;
import functions.Luck;
import functions.Set_buttons;
import main.Main;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Attack {
	
	Luck l = new Luck();
	Charge cg = new Charge();
	Block bk = new Block();
	Robot_attack rbt = new Robot_attack();
	Enemy e = new Enemy();
	
	public static byte nexts,eneme;
	public static JTextArea event;
	public static JFrame aa;
	
	public Attack() {
		eneme = 0;
		nexts = 0;
	}	
	
	private void bkm() {
		
		if(Main.b_health<=0) {
			aa.dispose();
			Main.f.setVisible(true);
			eneme=0;
			Main.stage=2;
		}
		
			event.setVisible(false);
			
			eneme+=5;
			if(eneme==7) {
				rbt.r_attack();
			}
			
			nexts = 1;
 
		}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void Attacks() {
		aa = new JFrame();
		aa.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		aa.setTitle("Die Schl\u00E4gerei");
		aa.setResizable(false);
		aa.getContentPane().setBackground(SystemColor.controlShadow);
		aa.getContentPane().setLayout(null);
		aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aa.setSize(550,375);
		aa.setVisible(true);
		
		
		aa.addMouseListener(new MouseListener() {


			@Override
			public void mouseClicked(MouseEvent e) {
				bkm();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
		
		
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
		
		JLabel title = new JLabel("Die Schl\u00E4gerei");
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
		
		JButton Charge_button = new JButton("CHARGE!");
		Charge_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nexts==1) {
					cg.charge();
				}
				else {
					bkm();
				}
			}
		});
		Charge_button.setForeground(SystemColor.windowBorder);
		Charge_button.setBackground(SystemColor.activeCaptionBorder);
		Charge_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Charge_button.setBounds(10, 243, 232, 63);
		aa.getContentPane().add(Charge_button);
		
		JButton Block_button = new JButton("BLOCK");
		Block_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nexts==1) {
					bk.block();
				}
				else {
					bkm();
				}
			}
		});
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
		
		event = new JTextArea();
		event.setLineWrap(true);
		event.setText(Main.b_name+" has attack you!");
		event.setFont(new Font("Myanmar Text", Font.PLAIN, 13));
		event.setBackground(SystemColor.controlHighlight);
		event.setEditable(false);
		event.setBounds(160, 126, 218, 43);
		aa.getContentPane().add(event);
		
		class refresh extends Thread{
			public void run() {
				while(true) {
					try {
						refresh.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					Health_label.setText("Health: "+Main.health);
					Damage_label.setText("Damage: "+Main.damage);
					first_item.setText(Main.inventory[0]);
					second_item.setText(Main.inventory[1]);
					third_item.setText(Main.inventory[2]);
					fourth_item.setText(Main.inventory[3]);
					fifth_item.setText(Main.inventory[4]);
					EHealth_label.setText("Health: "+Main.b_health);
					EDamage_label.setText("Damage: "+Main.b_damage);
					
				}
			}
		}
		
		refresh rr = new refresh();
		rr.start();
	}
}