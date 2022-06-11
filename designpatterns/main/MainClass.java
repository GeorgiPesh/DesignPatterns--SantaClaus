package designpatterns.main;

import designpatterns.observer.*;
import designpatterns.singleton.*;

public class MainClass {

	public static void main(String[] args) {
		
		MagicBoard mb = new MagicBoard();
		mb.addObserver(new Elf());
		SantaClaus santa = SantaClaus.getInstance();
		santa.wantBicycles(0);
		santa.wantDolls(0);
	}

}
