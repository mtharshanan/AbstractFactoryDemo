package patterns.abstractfactory.demo;

public class CarFacory2 implements CarFactory {

	@Override
	public Gear getGear() {
		return new GearB();
	}

	@Override
	public Color getColor() {
		return new ColorB();
	}

}
