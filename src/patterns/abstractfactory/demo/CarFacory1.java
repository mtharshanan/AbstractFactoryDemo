package patterns.abstractfactory.demo;

public class CarFacory1 implements CarFactory {

	@Override
	public Gear getGear() {
		return new GearA();
	}

	@Override
	public Color getColor() {
		return new ColorA();
	}

}
