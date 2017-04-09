package patterns.abstractfactory.demo;

public class AbstractFactoryDemo {

	public static void main(String[] args) {

		Car car1 = new CarA();
		buildCar((CarA) car1, new CarFacory1());
		System.out.println(car1);

		Car car2 = new CarB();
		buildCar((CarB) car2, new CarFacory2());
		System.out.println(car2);

		// Using the second method
		Car car1a = new CarA();
		buildBCarr(car1a);
		System.out.println("\n===== Second Method ======\n" + car1a);

	}

	private static void buildCar(Car car, CarFactory factory) {
		car.add(factory.getGear());
		car.add(factory.getColor());

	}

	// A second way of doing it in Java
	private static void buildBCarr(Car car) {
		String partType = car.getPartType();

		try {
			car.add((Gear) Class.forName("patterns.abstractfactory.demo.Gear" + partType).newInstance());
			car.add((Color) Class.forName("patterns.abstractfactory.demo.Color" + partType).newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
