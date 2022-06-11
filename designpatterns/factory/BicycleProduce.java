package designpatterns.factory;

public class BicycleProduce extends Workshop {
	public Toy createToy() {
		return new Bicycle();
	}
}
