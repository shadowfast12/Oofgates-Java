package main;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import attributes.weapon;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.SystemColor;

public class shop {
	
	weapon w = new weapon();
	
	public static String type;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void shope() {
		JFrame s;
		s = new JFrame();
		s.getContentPane().setBackground(Color.LIGHT_GRAY);
		s.setBackground(Color.LIGHT_GRAY);
		s.getContentPane().setForeground(Color.WHITE);
		s.setTitle("Shop");
		s.setType(Type.NORMAL);
		s.getContentPane().setLayout(null);
		s.setSize(450, 325);
		s.setVisible(true);

		
		JLabel title_lb = new JLabel("Le Shop");
		title_lb.setFont(new Font("Tahoma", Font.PLAIN, 32));
		title_lb.setBounds(10, 11, 121, 39);
		s.getContentPane().add(title_lb);
		
		JButton button = new JButton("New button");
		button.setBounds(335, 227, -89, -29);
		s.getContentPane().add(button);
		
		JButton Purchase_btn = new JButton("Purchase");
		Purchase_btn.setBackground(SystemColor.activeCaptionBorder);
		Purchase_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					w.weapons(35,20,100,"Iron Sword");
					w.weapons(50, 25, 100, "Mace");
					w.weapons(20, 15, 100, "Crowbar");
					w.weapons(80, 40, 100, "Sabre");
			}
		});
		Purchase_btn.setBounds(303, 216, 121, 34);
		s.getContentPane().add(Purchase_btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 121, 197);
		scrollPane.getVerticalScrollBar().setOpaque(false);
		s.getContentPane().add(scrollPane);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setForeground(Color.GRAY);
		verticalBox.setBackground(Color.GRAY);
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setViewportView(verticalBox);
		
		JLabel lblNewLabel = new JLabel("Iron Sword");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		verticalBox.add(lblNewLabel);
		
		JButton select_btn = new JButton("Select");
		select_btn.setBackground(SystemColor.activeCaptionBorder);
		select_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Iron Sword";
			}
		});
		verticalBox.add(select_btn);
		
		JLabel lblNewLabel_1 = new JLabel("__________");
		verticalBox.add(lblNewLabel_1);
		
		JLabel lblMace = new JLabel("Mace");
		lblMace.setFont(new Font("Tahoma", Font.PLAIN, 13));
		verticalBox.add(lblMace);
		
		JButton button_1 = new JButton("Select");
		button_1.setBackground(SystemColor.activeCaptionBorder);
		verticalBox.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Mace";
			}
		});
		
		JLabel label = new JLabel("__________");
		verticalBox.add(label);
		
		JLabel lblCrowbar = new JLabel("Crowbar");
		lblCrowbar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		verticalBox.add(lblCrowbar);
		
		JButton button_2 = new JButton("Select");
		button_2.setBackground(SystemColor.activeCaptionBorder);
		verticalBox.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Crowbar";
			}
		});
		
		JLabel label_1 = new JLabel("__________");
		verticalBox.add(label_1);
		
		JLabel lblSabre = new JLabel("Sabre");
		lblSabre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		verticalBox.add(lblSabre);
		
		JButton button_3 = new JButton("Select");
		button_3.setBackground(SystemColor.activeCaptionBorder);
		verticalBox.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Sabre";
			}
		});

		
		Canvas canvas = new Canvas();
		canvas.setBounds(150, 53, 130, 130);
		s.getContentPane().add(canvas);
	}
}
