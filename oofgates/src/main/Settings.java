package main;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;

import functions.Load_save;

import java.awt.Font;
import java.awt.SystemColor;

public class Settings {
	
	Load_save ls = new Load_save();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void setting() {
		JFrame s;
		s = new JFrame();
		s.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		s.setBackground(SystemColor.windowBorder);
		s.setTitle("Settings");
		s.getContentPane().setLayout(null);
		s.setVisible(true);
		s.setSize(200, 200);
		
		JLabel title_lb = new JLabel("Settings");
		title_lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		title_lb.setBounds(10, 11, 164, 19);
		s.getContentPane().add(title_lb);
		
		JButton load_btn = new JButton("Load Game");
		load_btn.setBounds(10, 41, 113, 32);
		s.getContentPane().add(load_btn);
		load_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ls.loader();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
