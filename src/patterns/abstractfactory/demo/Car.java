package patterns.abstractfactory.demo;

public abstract class Car {

	private Gear _gear;
	private Color _color;

	@Override
	public String toString() {
		return String.format("%s %s %s", getClass(), _gear, _color);
	}

	public void add(Gear gear) {
		_gear = gear;
	}

	public void add(Color color) {
		_color = color;
	}
	
	public abstract String getPartType();

}
