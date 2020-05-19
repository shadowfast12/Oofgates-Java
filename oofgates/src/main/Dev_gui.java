package main;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.SystemColor;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Dev_gui {
	private JTextField command;
	private String input;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void dev() {
		JFrame d;
		d = new JFrame();
		d.setTitle("Dev Console");
		d.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		d.setResizable(false);
		d.setVisible(true);
		d.setSize(350,75);
		d.getContentPane().setLayout(null);
		d.setFocusable(true);
		d.requestFocusInWindow();
		
		command = new JTextField();
		command.setBackground(SystemColor.controlLtHighlight);
		command.setText("command here");
		command.setBounds(10, 11, 324, 20);
		d.getContentPane().add(command);
		command.setColumns(10);
		command.setFocusable(true);
		command.addKeyListener(new KeyListener() {
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String cmd = command.getText();
					int number;
					
					if(cmd.contains("coins")==true) {
						String conv = cmd.replaceAll("[^0-9]","");
						number = Integer.valueOf(conv);
						Main.coins += number;
					}
				}
			}
			public void keyTyped(KeyEvent e) {
				
			}
			public void keyReleased(KeyEvent e) {
				
			}
		});
		
	}
}
