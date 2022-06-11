package designpatterns.factory;

public class DollProduce extends Workshop {
	public Toy createToy() {
		return new Doll();
	}
}
