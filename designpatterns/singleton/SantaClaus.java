package designpatterns.singleton;

public class SantaClaus {
	
	private static SantaClaus santaClaus = null;
	
	public static SantaClaus getInstance() {
		synchronized (SantaClaus.class) {
			if (santaClaus == null)
				santaClaus = new SantaClaus();
		}
		return santaClaus;
	}
	
	private SantaClaus() {
	}
	
	public int wantDolls (int numberofDolls){
        return numberofDolls;
	}
	
	public int wantBicycles (int numberofBicycles){
		return numberofBicycles;
	}

}
