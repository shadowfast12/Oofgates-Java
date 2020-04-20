package functions;

import attack.Attack;
import main.Main;

public class Lister {

	//normal
	public void listers(String s) {
		Main.all_events.add(s);
		Main.event_label.setText(s);
		Main.list_1.setListData(Main.all_events.toArray(new String[0]));
	}
	//for the attack event label only
	public void listers(String s,boolean b) {
		Main.all_events.add(s);
		Main.list_1.setListData(Main.all_events.toArray(new String[0]));
		
		Attack.event.setText(s);
		Attack.nexts = 0;
		Attack.event.setVisible(true);
	}
}
