package casino;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import functions.Luck;
import main.Main;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;


public class Blackjack{
		
	ArrayList<Integer> cards = new ArrayList<Integer>();
	
	private int number, total_amnt, bot_total, aces;
	
	private JTextArea event;
	private JPanel user, panel_2, ace_pan;
	private JButton hit_btn, btnStand, one_btn, elv_btn;
	private JPanel panel, panel_1;
	private JLabel hit_lb, totalNum_lb, CrntNum_lb, AllNum_lb, botCur_lb, lblTotalAmount,
		who_lb, who2_lb, lblNewLabel, dhit_lb, dtotal_lb, ace_lb;
	private boolean bot_end, pp_end, vis; 
	private JFrame BlackJack;
	
	Luck l = new Luck();
	Random ran = new Random();
	
	//Method to sets the cards to values in array
	public void val_cards() {
		number=0;total_amnt=0;bot_total=0;aces=0;
		pp_end=false;bot_end=false;Main.index=1;
		 
		if(cards.size()>0) {
			for(int x=cards.size()-1;x>-1;x--)
				cards.remove(x);
		}
		
		int num=1;
		
		for(int x=1;x<53;x++) {
			
			cards.add(num);
			
			if(x/num==4) {
				num++;
			}
		}
		
	}
	
	public void pop_up(String s, boolean b, int i) {
		event.setText(s);
		vis=b;
		event.setVisible(b);
		
		Main.coins+=(Casino.bet_amnt*i);
	}
	
	//Method to determine who won
	public void settlement() {
		
		if(total_amnt>21) {
			pop_up("Busted! You've lost $"+Casino.bet_amnt,true,0);
		}
		if(bot_total>21) {
			pop_up("Dealer Busted! You've gained $"+Casino.bet_amnt,true,2);
		}
	}
	
	//Hit Method
	public void hit(int i) {
		//true = player, false = bot
		 		
		int temp_b = ran.nextInt(cards.size());
				
		Integer[] mm_a = cards.toArray(new Integer[temp_b]);
				
		number = mm_a[temp_b];
				
		cards.remove(temp_b);
		
		//choose number for ace
		if(number==1) {
			ace_pan.setVisible(true);
			aces++;
		}
		
		//Jack Card
		if(number==11) {
			number=10;
		}
		//Queen Card
		if(number==12) {
			number=10;
		}
		//King Card
		if(number==13) {
			number=10;
		}
		
		if(i == 1) {
			hit_lb.setText(String.valueOf(number));
			total_amnt+=number;
			totalNum_lb.setText(String.valueOf(total_amnt));
			
		}
		else{
			dhit_lb.setText(String.valueOf(number));
			bot_total+=number;
			dtotal_lb.setText(String.valueOf(bot_total));
			
		}
	}
	
	//Stand Method
	public void stand(){
		
		if(pp_end==true && bot_end==true) {
			
			if(total_amnt>bot_total) {
				pop_up("You've gained $"+Casino.bet_amnt,true, 2);
			}
			if(total_amnt==bot_total) {
				pop_up("You have tied with the dealer, Nothing gained.",true,1);
			}
			BlackJack.setVisible(false);
		}
	}
	
	//bot func
	public void bot_d() {
		
		if(total_amnt<=21) {
			if(bot_total<17 || bot_total<total_amnt) {
				hit(2);
				
				if(number==1 && bot_total<=10) {
					bot_total+=10;
				}
			}
			else {
				bot_end=true;
				stand();
			}
		}
		else {
			bot_end=true;
			stand();
		}
		settlement();
	}
			
	//aces set
	public void add_a(int a) {
		if(aces>0) {
			aces--;
			total_amnt+=a;
			totalNum_lb.setText(String.valueOf(total_amnt));
			
			if(aces==0) {
				ace_pan.setVisible(false);
			}
		}
	}
	
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void blackjacks() {
		
		BlackJack = new JFrame();
		BlackJack.setTitle("BlackJack");
		BlackJack.getContentPane().setBackground(new Color(192, 192, 192));
		BlackJack.setBackground(SystemColor.textInactiveText);
		BlackJack.getContentPane().setLayout(null);
		BlackJack.setVisible(true);
		BlackJack.setSize(new Dimension(800, 450));
		
		MouseListener click = new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				if(vis==true) {
					BlackJack.setVisible(false);
					Main.f.setVisible(true);
				}
			}

			public void mousePressed(MouseEvent e) {
				
			}

			public void mouseReleased(MouseEvent e) {
				
			}

			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
		};
		
		//set cards
		val_cards();
		BlackJack.addMouseListener(click);
		
		event = new JTextArea();
		event.setText("event_here");
		event.setWrapStyleWord(true);
		event.setVisible(false);
		event.setColumns(8);
		event.setRows(33);
		event.setLineWrap(true);
		event.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		event.setEditable(false);
		event.setBackground(SystemColor.controlHighlight);
		event.setBounds(282, 156, 200, 79);
		BlackJack.getContentPane().add(event);
		
		user = new JPanel();
		user.setBounds(13, 130, 150, 150);
		BlackJack.getContentPane().add(user);
		
		panel = new JPanel();
		panel.setBounds(198, 130, 150, 150);
		BlackJack.getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(422, 130, 150, 150);
		BlackJack.getContentPane().add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(608, 130, 150, 150);
		BlackJack.getContentPane().add(panel_2);
		
		hit_lb = new JLabel();
		hit_lb.setHorizontalAlignment(SwingConstants.CENTER);
		hit_lb.setFont(new Font("Tahoma", Font.PLAIN, 99));
		user.add(hit_lb);
		
		hit_btn = new JButton("Hit");
		hit_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		hit_btn.setBounds(35, 322, 128, 47);
		BlackJack.getContentPane().add(hit_btn);
		hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hit(1);
				settlement();
				bot_d();
			}
		});
		
		btnStand = new JButton("Stand");
		btnStand.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStand.setBounds(186, 322, 128, 47);
		BlackJack.getContentPane().add(btnStand);									
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pp_end = true;
				stand();
				
				while(bot_end==false){
					bot_d();
				}
			}
		});
		
		totalNum_lb = new JLabel("");
		totalNum_lb.setHorizontalAlignment(SwingConstants.CENTER);
		totalNum_lb.setFont(new Font("Tahoma", Font.PLAIN, 99));
		panel.add(totalNum_lb);
		
		dhit_lb = new JLabel("");
		dhit_lb.setHorizontalAlignment(SwingConstants.CENTER);
		dhit_lb.setFont(new Font("Tahoma", Font.PLAIN, 99));
		panel_1.add(dhit_lb);
				
		dtotal_lb = new JLabel("");
		dtotal_lb.setHorizontalAlignment(SwingConstants.CENTER);
		dtotal_lb.setFont(new Font("Tahoma", Font.PLAIN, 99));
		panel_2.add(dtotal_lb);
				
		CrntNum_lb = new JLabel("Current Number");
		CrntNum_lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		CrntNum_lb.setHorizontalAlignment(SwingConstants.CENTER);
		CrntNum_lb.setBounds(13, 100, 150, 25);
		BlackJack.getContentPane().add(CrntNum_lb);
		
		AllNum_lb = new JLabel("Total Amount");
		AllNum_lb.setHorizontalAlignment(SwingConstants.CENTER);
		AllNum_lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		AllNum_lb.setBounds(198, 100, 150, 25);
		BlackJack.getContentPane().add(AllNum_lb);
		
		botCur_lb = new JLabel("Current Number");
		botCur_lb.setHorizontalAlignment(SwingConstants.CENTER);
		botCur_lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		botCur_lb.setBounds(422, 100, 150, 25);
		BlackJack.getContentPane().add(botCur_lb);
		
		lblTotalAmount = new JLabel("Total Amount");
		lblTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalAmount.setBounds(608, 100, 150, 25);
		BlackJack.getContentPane().add(lblTotalAmount);
		
		who_lb = new JLabel("Player's");
		who_lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		who_lb.setHorizontalAlignment(SwingConstants.CENTER);
		who_lb.setBounds(13, 85, 336, 16);
		BlackJack.getContentPane().add(who_lb);
		
		who2_lb = new JLabel("Dealer's");
		who2_lb.setHorizontalAlignment(SwingConstants.CENTER);
		who2_lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		who2_lb.setBounds(422, 85, 336, 16);
		BlackJack.getContentPane().add(who2_lb);
		
		lblNewLabel = new JLabel("BLACKJACK");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(252, 13, 263, 59);
		BlackJack.getContentPane().add(lblNewLabel);
		
		ace_pan = new JPanel();
		ace_pan.setBounds(432, 298, 294, 92);
		BlackJack.getContentPane().add(ace_pan);
		ace_pan.setLayout(null);
		ace_pan.setVisible(false);
		
		ace_lb = new JLabel("Choose Number for Ace");
		ace_lb.setHorizontalAlignment(SwingConstants.CENTER);
		ace_lb.setBounds(0, 0, 294, 19);
		ace_lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		ace_pan.add(ace_lb);
		
		one_btn = new JButton("1");
		one_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		one_btn.setBounds(10, 32, 100, 35);
		ace_pan.add(one_btn);
		one_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_a(0);
			}
		});
		
		elv_btn = new JButton("11");
		elv_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		elv_btn.setBounds(182, 32, 100, 35);
		ace_pan.add(elv_btn);
		elv_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_a(10);
			}
		});
		
		//first blackjack stuff
		hit(1);
		hit(1);
		hit(2);
		hit(2);
	}
}
