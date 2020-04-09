package functions;

import java.util.concurrent.ThreadLocalRandom;

import main.Main;

public class Luck {
	
	public static void luckr(int f, int s) {
		Main.luck = ThreadLocalRandom.current().nextInt(f,s);
	}
	
	public static void luckr() {
		Main.luck = ThreadLocalRandom.current().nextInt(1,10);
	}
	
	

}
