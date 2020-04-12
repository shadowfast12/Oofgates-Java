package functions;

import main.Main;

public class Lister {

	public void listers(String s) {
		Main.all_events.add(s);
		Main.event_label.setText(s);
		Main.list_1.setListData(Main.all_events.toArray(new String[0]));
	}
}
