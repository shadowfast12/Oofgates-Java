package casino;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import functions.Luck;
import main.Main;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Casino {
	
	Luck l = new Luck();
	
	ArrayList<Byte> cards = new ArrayList<Byte>();
	private int bet_amnt;
	
	public static int raw_num;

	
	//Method to sets the cards to values in array
	public void val_cards() {
		
		if(cards.size()>0) {
			for(int x=cards.size()-1;x>-1;x--)
				cards.remove(x);
		}
		
		byte num=1;
		
		for(byte x=1;x<53;x++) {
			
			cards.add(num);
			
			if(x/num==4) {
				num++;
			}
		}
		System.out.println(cards);
		
	}
	//Hit Method
	public void hit() {
		l.luckr(0, cards.size());
		
		int number = 0;
		double temp_b = Main.luck;
		String type_b;
		
		//Determines the value of the card
		for(int x=0;x<13;x++) {
			
			if(Math.floor(temp_b/x)==temp_b/x) {
				number=x;
				raw_num=x;
				
				type_b=String.valueOf(x);
				
				//Ace Card
				if(x==1) {
					type_b ="Ace";
				}
				//Jack Card
				if(x==11) {
					type_b = "Jack";
					number=10;
				}
				//Queen Card
				if(x==12) {
					type_b = "Queen";
					number=10;
				}
				//King Card
				if(x==13) {
					type_b = "King";
					number=10;
				}
			}
		}
		
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public void casino() {
		JFrame c;
		c= new JFrame();
		c.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		c.setTitle("Le Casino");
		c.setSize(350,350);
		c.getContentPane().setLayout(null);
		
		JLabel title_lb = new JLabel("Le Casino");
		title_lb.setFont(new Font("Tahoma", Font.BOLD, 30));
		title_lb.setBounds(12, 13, 170, 25);
		c.getContentPane().add(title_lb);
		
		JTextArea welcome_lb = new JTextArea();
		welcome_lb.setBackground(SystemColor.activeCaptionBorder);
		welcome_lb.setLineWrap(true);
		welcome_lb.setColumns(2);
		welcome_lb.setRows(2);
		welcome_lb.setText("Welcome to the Casino, how much would you   like to bet for BlackJack?");
		welcome_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		welcome_lb.setBounds(10, 65, 314, 52);
		c.getContentPane().add(welcome_lb);
		
		SpinnerModel value = new SpinnerNumberModel(0,0,Main.coins,1);
		JSpinner spinner = new JSpinner(value);
		spinner.setForeground(SystemColor.activeCaptionBorder);
		spinner.setBackground(SystemColor.activeCaptionBorder);
		spinner.setBounds(108, 128, 87, 37);
		c.getContentPane().add(spinner);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				bet_amnt = (int) ((JSpinner)e.getSource()).getValue();
			}
		});
				
		
		JButton bet_btn = new JButton("BET");
		bet_btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bet_btn.setBounds(93, 176, 127, 37);
		c.getContentPane().add(bet_btn);
		c.setVisible(true);
		bet_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((Main.coins-=bet_amnt)>=0) {
					Main.coins-=bet_amnt;
					Blackjack bj = new Blackjack();
					bj.blackjacks();
				}
			}
		});
		
		
	}
}
