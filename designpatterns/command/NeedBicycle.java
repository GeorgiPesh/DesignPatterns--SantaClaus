package designpatterns.command;

import designpatterns.observer.MagicBoard;
import designpatterns.singleton.SantaClaus;

public class NeedBicycle implements SantaClausCommand {
	SantaClaus santa = SantaClaus.getInstance();
	private String toy = "Bicycle";
	private int amount = santa.wantBicycles(numberofBicycles);
	
	public NeedBicycle() {
	}
	
	@Override
	public String requestToy() {
		return MagicBoard.getToy(toy);
	}

	@Override
	public int requestAmount() {
		return MagicBoard.getAmount(amount);
	}
	
}
