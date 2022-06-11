package designpatterns.observer;

import java.util.Observable;

public class MagicBoard extends Observable {
		public static String requestedToy = new String();
		public static int requestedAmount = 0;
		
		public MagicBoard() {
		}
		
		public static String getToy(String getToy) {
			requestedToy = getToy;
			return requestedToy;
		}
		
		@SuppressWarnings("static-access")
		public void setToy(String requestedToy) {
			this.requestedToy = requestedToy;
			setChanged();
			notifyObservers(requestedToy);
		}
		
		public static int getAmount(int amount) {
			requestedAmount = amount;
			return amount;
		}
		
		@SuppressWarnings("static-access")
		public void setAmount(int requestedAmount) {
			this.requestedAmount = requestedAmount;
			setChanged();
			notifyObservers(requestedAmount);
		}
}
