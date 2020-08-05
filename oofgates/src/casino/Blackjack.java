package casino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;

import functions.Luck;
import main.Main;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Blackjack{
		
	ArrayList<Integer> cards = new ArrayList<Integer>();
	
	private int number, where, total_amnt, bot_total;
	
	private JPanel user, panel_2;
	private JButton hit_btn, btnStand;
	private JPanel panel, panel_1;
	private JLabel hit_lb, totalNum_lb, CrntNum_lb, AllNum_lb, botCur_lb, lblTotalAmount,
		who_lb, who2_lb, lblNewLabel, dhit_lb, dtotal_lb;
	
	Luck l = new Luck();
	Random ran = new Random();
	
	//Method to sets the cards to values in array
	public void val_cards() {
		
		where=0;
		
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
	
	//Method to determine who won
	public void settlement() {
		
		if(total_amnt<=21 && total_amnt>bot_total) {
			Main.coins+=(Casino.bet_amnt*2);
		}
		
		
		
	}
	
	//Hit Method
	public void hit(boolean b) {
		//true = player, false = bot
		 		
		int temp_b = ran.nextInt(cards.size());
				
		Integer[] mm_a = cards.toArray(new Integer[temp_b]);
				
		number = mm_a[temp_b];
				
		cards.remove(temp_b);
		
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
		
		if(b = true) {
			hit_lb.setText(String.valueOf(number));
			total_amnt+=number;
		}
		else {
			dhit_lb.setText(String.valueOf(number));
			bot_total+=number;
		}
	}
	
	//Stand Method
	public void stand(){
		where++;
		
		if(where==2) {
			
		}
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public void blackjacks() {
		
		JFrame BlackJack = new JFrame();
		BlackJack.getContentPane().setBackground(SystemColor.windowBorder);
		BlackJack.setBackground(SystemColor.textInactiveText);
		BlackJack.getContentPane().setLayout(null);
		BlackJack.setVisible(true);
		BlackJack.setSize(new Dimension(800, 450));
		
		//set cards
		val_cards();
		
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
				hit(true);
			}
		});
		
		btnStand = new JButton("Stand");
		btnStand.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStand.setBounds(186, 322, 128, 47);
		BlackJack.getContentPane().add(btnStand);
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
			
	}
}
