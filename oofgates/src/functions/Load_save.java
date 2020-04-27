package functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import main.Main;

public class Load_save {
	
	Set_buttons sb = new Set_buttons();
	
	private int[] output;
	private String[] inv_out;
	
	public void loader() throws IOException {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"));
			output = (int[]) ois.readObject();
			
			ObjectInputStream ois_i = new ObjectInputStream(new FileInputStream("data_i.dat"));
			Main.inventory = (String[]) ois_i.readObject();
			
			Main.stage = output[0];
			Main.coins = output[1];
			Main.damage = output[2];
			Main.health = output[3];
			Main.armor = output[4];
			Main.speed = output[5];
			Main.level = output[6];
			Main.exp = output[7];

			sb.set_button();
			
			ois_i.close();
			ois.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
