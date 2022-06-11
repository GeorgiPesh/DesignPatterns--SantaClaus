package designpatterns.command;

import designpatterns.observer.MagicBoard;
import designpatterns.singleton.SantaClaus;

public class NeedDolls implements SantaClausCommand{
	SantaClaus santa = SantaClaus.getInstance();
	private String toy = "Doll";
	private int amount = santa.wantDolls(numberofDolls);
	
	public NeedDolls() {
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
