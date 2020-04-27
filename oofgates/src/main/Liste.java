package main;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JList;

public class Liste {
			
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void list_gui() {
		JFrame lg;
		lg = new JFrame("Events");
		lg.setSize(600,600);
		lg.setVisible(true);
		lg.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		lg.getContentPane().add(scrollPane);
		
		Main.list = new JList<String>();
		scrollPane.setViewportView(Main.list);
		
		class liste extends Thread{
			public void run() {
				while(true) {
					try {
						liste.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Main.list.setListData(Main.all_events.toArray(new String[0]));
					
				}
			}
		}
		liste le = new liste();
		le.start();

	}
	
	
}
