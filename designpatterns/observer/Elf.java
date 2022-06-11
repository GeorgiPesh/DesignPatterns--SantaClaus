package designpatterns.observer;

import java.util.Observable;
import java.util.Observer;
import designpatterns.factory.*;

public class Elf implements Observer {
	public static String mbReadToy;
	public static int mbReadAmount;
	public static int dollCount =0;
	public static int bicycleCount = 0;
	Workshop workshop;
	
	public Elf() {
	}
	
	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			mbReadToy = (String) arg;
			System.out.println("Elf: Alright, Santa wants " + mbReadToy + "s!");
		}
		if (arg instanceof Integer) {
			mbReadAmount = (int) arg;
			System.out.println("Elf: And he wants " + mbReadAmount + " of them!");
		}
		
		createTheToy(workshop);	
	}

	private static void createTheToy(Workshop workshop) {
		if (mbReadToy == "doll") {
			for(int i = 0; i < mbReadAmount; i++) {
				workshop = new DollProduce();
			}
		}
		if (mbReadToy == "bicycle") {
			for(int i = 0; i < mbReadAmount; i++) {
				workshop = new BicycleProduce();
			}
		}
		System.out.println(mbReadAmount + " " + mbReadToy + " has been produced!");
	}
}
