package functions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import main.Main;

public class Save {
	
	private int info[] = new int[8];
	public String intv[] = new String[4];
	
	public void save() {
		try {
			info[0] = Main.stage;
			info[1] = Main.coins;
			info[2] = Main.damage;
			info[3] = Main.health;
			info[4] = Main.armor;
			info[5] = Main.speed;
			info[6] = Main.level;
			info[7] = Main.exp;
			
			intv = Main.inventory;
			
			
			ObjectOutputStream data = new ObjectOutputStream(new FileOutputStream("data.dat"));
			data.writeObject(info);
			ObjectOutputStream i_data = new ObjectOutputStream(new FileOutputStream("data_i.dat"));
			i_data.writeObject(intv);
			
			i_data.close();
			data.close();
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}
}
