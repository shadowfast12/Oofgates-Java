package casino;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import functions.Luck;
import graphic.assets;
import main.Main;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Blackjack extends JPanel{
		
	ArrayList<Byte> cards = new ArrayList<Byte>();
	
	public static int raw_num;
	private JPanel user;

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
	
	Luck l = new Luck();
	

	
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
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(assets.card,0,0,null);

	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void blackjacks() {
		Blackjack bj = new Blackjack();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.windowBorder);
		f.setBackground(SystemColor.textInactiveText);
		f.getContentPane().setLayout(null);
		f.setVisible(true);
		f.setSize(new Dimension(800, 400));
		
		//set cards
		val_cards();
		hit();
		
		user = new JPanel();
		user.setBounds(12, 13, 350, 250);
		f.getContentPane().add(user);
		user.add(bj);
		
		JPanel robot = new JPanel();
		robot.setBounds(421, 13, 350, 250);
		f.getContentPane().add(robot);
		
		JButton hit_btn = new JButton("hit");
		hit_btn.setBounds(64, 276, 97, 25);
		f.getContentPane().add(hit_btn);
		hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hit();
				assets.init();
			}
		});
			
	}
}
