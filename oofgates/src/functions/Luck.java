package functions;

import java.util.concurrent.ThreadLocalRandom;

import main.Main;

public class Luck {
	
	public void luckr(int f, int s) {
		//Integer f to s
		Main.luck = ThreadLocalRandom.current().nextInt(f,s++);
	}
	
	public void luckr() {
		//Integer 1 to 10
		Main.luck = ThreadLocalRandom.current().nextInt(1,11);
	}
	
	

}
